package com.fuxinyu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuxinyu.domain.User;
import com.fuxinyu.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： fuxinyu
 * Date: 2019/9/24
 * Time: 17:09
 * Description:
 */
@RestController
@RequestMapping("/test")
public class Test {

    @Reference
    private UserService userService;

    @RequestMapping("selectByPrimaryKey")
    public User selectByPrimaryKey(Integer id){

        User user = userService.selectByPrimaryKey(id);
        System.out.println("查询成功");
        return user;

    }
}
