package com.company.proj;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("# :");
            String account = scanner.next();
            System.out.println("pin: ");
            String pin = scanner.next();
            for (BankAccount b : Database.allAccounts) {
                if (b != null) {
                    if (b.getAccountNumber().equalsIgnoreCase(account) &&
                            b.getPinCode().equalsIgnoreCase(pin)) {
                        if (b instanceof CityBankAccount) {
                            System.out.println("    PRESS [1] TO CASH WITHDRAWAL" +
                                    "\n" +
                                    "               PRESS [2] TO VIEW BALANCE" +
                                    "\n" +
                                    "               PRESS [3] TO CHANGE PIN CODE\n" +
                                    "\n" +
                                    "               PRESS [4] TO CASH IN ACCOUNT\n" +
                                    "\n" +
                                    "               PRESS [5] TO VIEW ACCOUNT DATA\n" +
                                    "\n" +
                                    "               PRESS [6] TO EXIT");
                        }
                        int choice = scanner.nextInt();
                        if (choice == 1) {
                            System.out.println("how much: ");
                            b.creditBalance(scanner.nextInt());
                        } else if (choice == 2) {
                            System.out.println(b.totalBalance());
                        } else if (choice == 3) {
                            System.out.println("new pin: ");
                            b.setPinCode(scanner.next());
                        } else if (choice == 4) {
                            System.out.println("how much: ");
                            b.debetBalance(scanner.nextInt());
                        } else if (choice == 5) {
                            b.accountData();
                        } else if (choice == 6) {
                            System.exit(0);
                        }
                    }
                }

            }

        }


    }
}
