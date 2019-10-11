package com.fuxinyu.base.shiro;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuxinyu.bean.Permissions;
import com.fuxinyu.bean.Role;
import com.fuxinyu.domain.UserLogin;
import com.fuxinyu.service.login.IUserLoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.SimpleByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

/**
 * @author： fuxinyu
 * Date: 2019/9/30
 * Time: 10:05
 * Description: shiro之realm
 */
public class CustomRealm extends AuthorizingRealm {

    private DubboSupport dubboSupport;

    public CustomRealm(DubboSupport dubboSupport) {
        this.dubboSupport = dubboSupport;
    }


    //完成用户授权的方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

//        //获取登录用户名
//        String name = (String) principalCollection.getPrimaryPrincipal();
//        //根据用户名去数据库查询用户信息
//        UserLogin user =  DubboSupport.loginService.getUserByName(name);
//        //添加角色和权限
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        for (Role role : user.getRoles()) {
//            //添加角色
//            simpleAuthorizationInfo.addRole(role.getRoleName());
//            //添加权限
//            for (Permissions permissions : role.getPermissions()) {
//                simpleAuthorizationInfo.addStringPermission(permissions.getPermissionsName());
//            }
//        }
//        Assert.notNull(user, "找不到principals中的SessionVariable");
//        return simpleAuthorizationInfo;

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        UserLogin userLogin = (UserLogin) principalCollection.getPrimaryPrincipal();
        Assert.notNull(userLogin, "找不到principals中的SessionVariable");

        return simpleAuthorizationInfo;

    }


    //完成账号认证的方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        String name = authenticationToken.getPrincipal().toString();
        //去数据库中查询该用户名对应的信息
        UserLogin user = DubboSupport.loginService.getUserByName(name);
        if (user == null) {
            //这里返回后会报出对应异常 账号不存在
            return null;
        } else {
            //获取数据库中该账号的密码
            String userPassword = user.getUserPassword();
            SecurityUtils.getSubject().getSession().setAttribute("user", user);
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getUserPassword().toString(), getName());
            return simpleAuthenticationInfo;
        }




    }
}
