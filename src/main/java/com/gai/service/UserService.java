package com.gai.service;

import com.gai.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserService(){
        System.out.println("UserService 的 无参构造函数执行");
    }
//
//    public UserService(UserDao userDao){
//        this.userDao = userDao;
//        System.out.println("UserService 的 有参构造函数执行");
//    }

    public void add(){
        System.out.println("业务逻辑层");
        userDao.add();
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("UserService的setUserDao方法被调用");
        this.userDao = userDao;
    }
}
