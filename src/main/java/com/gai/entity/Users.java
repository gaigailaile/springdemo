package com.gai.entity;

public class Users {
    public Users() {
        System.out.println("users 无参构造函数");
    }

    public Users(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("users 有参构造函数 " + name + age + "岁了");
    }

    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
