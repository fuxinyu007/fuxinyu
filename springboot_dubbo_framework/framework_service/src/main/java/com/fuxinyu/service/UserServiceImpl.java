package com.fuxinyu.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuxinyu.domain.User;
import com.fuxinyu.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author： fuxinyu
 * Date: 2019/9/24
 * Time: 17:06
 * Description:
 */
@Service
@Component
public class UserServiceImpl implements UserService{

    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());


    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer id) {
        log.info("查询");
        return userMapper.selectByPrimaryKey(id);
    }
}
