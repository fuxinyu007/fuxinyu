package com.fuxinyu.service.login;

import com.fuxinyu.domain.UserLogin;

/**
 * @author： fuxinyu
 * Date: 2019/9/30
 * Time: 9:40
 * Description:
 */
public interface IUserLoginService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);

    UserLogin getUserByName(String userName);
}
