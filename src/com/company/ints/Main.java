package com.company.ints;

public class Main {

    public static void main(String[] args) {

        Users u1 = new Users("John","Smith");
        Users u2 = new Users("uu","Smith");
        Users u3 = new Users("John","3");
        Users [] users = {u1,u2,u3};
        UserBean userBean = new UserBeanImplements(users);
//        userBean.getAllUsers();
//        userBean.getUsersByName("John");
//        userBean.getUsersBySurname("Smith");
    }

}
