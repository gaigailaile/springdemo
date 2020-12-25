package com.gai.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public UserDao(){
        System.out.println("userDao 的无参构造函数调用");
    }

    public void add(){
        System.out.println("访问数据库!");
    }
}
