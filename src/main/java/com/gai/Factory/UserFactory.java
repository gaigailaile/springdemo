package com.gai.Factory;

import com.gai.entity.Users;

public class UserFactory {
    public Users getEntity(){
        System.out.println("工厂方式创建User");
        return new Users();
    }

    public static Users getStaticEntity(){
        System.out.println("静态工厂方式创建User");
        return new Users();
    }
}
