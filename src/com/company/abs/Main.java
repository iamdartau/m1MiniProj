package com.company.abs;

public class Main {

    public static void main(String[] args) {
        FerrariEngine fe = new FerrariEngine(2.3,2,3);
        RenaultEnigine re = new RenaultEnigine(1.3,2,3.1,4.4);
        Engine [] engines = {fe,re};
        for (Engine e: engines) {
            System.out.println(e.getMaxSpeed());
        }

    }
}
