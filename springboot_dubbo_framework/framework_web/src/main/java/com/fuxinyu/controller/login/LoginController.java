package com.fuxinyu.controller.login;

import com.fuxinyu.domain.UserLogin;
import com.fuxinyu.service.login.IUserLoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： fuxinyu
 * Date: 2019/9/30
 * Time: 10:16
 * Description:
 */
@RestController
@RequestMapping("/login")
public class LoginController {


    @RequestMapping("/login")
    public String login(UserLogin user) {
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        //对前端传过来的密码进行加密
        Md5Hash md5 = new Md5Hash(user.getUserPassword());

        //获取前端传过来的用户名 密码
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                user.getUserName(),
                md5.toString()
        );
        try {
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(usernamePasswordToken);
//            subject.checkRole("admin");
//            subject.checkPermissions("query", "add");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "账号或密码错误！";
        } catch (AuthorizationException e) {
            e.printStackTrace();
            return "没有权限";
        }
        return "login success";
    }

    //注解验角色和权限
//    @RequiresRoles("admin")
//    @RequiresPermissions("add")
    @RequestMapping("/index")
    public String index() {
        System.out.println("ssssssssssssss");
        return "redirect:login/login";
    }


}



