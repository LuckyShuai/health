package com.itheima.health.dao;

import com.itheima.health.pojo.User;

public interface UserDao {
    User findByUserName(String username);
}
