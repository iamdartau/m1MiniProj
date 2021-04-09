package com.company.proj;

public class Database {

    public static BankAccount[] allAccounts = new BankAccount[10];

    static {
        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev",200000,"KZ010322312", "0102");

        allAccounts[1] = new CityBankAccount("Erbol","Assanbek",200000,"KZ010322333", "1111");

        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev",10000000,"KZ0101112", "2000");
    }
}
