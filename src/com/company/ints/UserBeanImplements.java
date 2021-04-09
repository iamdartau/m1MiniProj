package com.company.ints;

public class UserBeanImplements implements UserBean {

    Users [] users;

    public UserBeanImplements(Users[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (Users u: users) {
            System.out.println(u);
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (Users u: users) {
            if (u.getName().equals(name)){
                System.out.println(u);
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (Users u: users) {
            if (u.getSurname().equals(surname)){
                System.out.println(u);
            }
        }
    }
}
