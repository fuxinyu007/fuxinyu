package com.fuxinyu.service.login;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuxinyu.domain.UserLogin;
import com.fuxinyu.mapper.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author： fuxinyu
 * Date: 2019/9/30
 * Time: 9:44
 * Description:
 */
@Service
@Component
public class UserLoginServiceImpl implements IUserLoginService {


    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UserLogin record) {
        return 0;
    }

    @Override
    public int insertSelective(UserLogin record) {
        return 0;
    }

    @Override
    public UserLogin selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserLogin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserLogin record) {
        return 0;
    }

    @Override
    public UserLogin getUserByName(String userName) {

        return userLoginMapper.getUserByName(userName);
    }
}
