package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @author：xu
 * @createTime： 2019/5/27 - 21:26
 */
public interface UsersMapper {
    void insertUser(Users users);

    List<Users> selectUserAll();
}
