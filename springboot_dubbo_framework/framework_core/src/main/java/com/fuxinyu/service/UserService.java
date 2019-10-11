package com.fuxinyu.service;

import com.fuxinyu.domain.User;

/**
 * @author： fuxinyu
 * Date: 2019/9/24
 * Time: 17:05
 * Description:
 */
public interface UserService {
    User selectByPrimaryKey(Integer id);
}
