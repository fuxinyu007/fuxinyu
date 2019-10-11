package com.fuxinyu.base.shiro;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuxinyu.service.login.IUserLoginService;
import org.springframework.stereotype.Component;

/**
 * @author： fuxinyu
 * Date: 2019/9/30
 * Time: 14:25
 * Description: 为了在realm中注入service而写的中间类
 */
//@Component
public class DubboSupport {

    @Reference
    public static IUserLoginService loginService;
}
