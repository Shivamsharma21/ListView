package com.example.listview;

public class Person {

    private  String name;
     private  String birthday;
     private String Sex;

    public Person(String name, String birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        Sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
