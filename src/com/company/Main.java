package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n: ");
        int[] nums = new int[scanner.nextInt()];
        int [] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i]%2==0){
                ints[i] = nums[i];
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]!=0){
                System.out.println(ints[i]);
            }
        }
        
        //todo спросить про 30

/*
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]>0 && nums[i+1] >0){
                System.out.println("no");
                return;
            }
        }
*/
        /*
        29
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==0){
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j]!=0){
                        sum+=nums[j];
                    }else {
                        System.out.println(sum);
                        break;
                    }
                }
                break;
            }
        }*/

        /*25
        int m = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m) {
                sum += nums[i];
                count++;
            }
        }
        System.out.println(sum/count);*/
        /*int max = nums[0];
        int id = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                id = i;
            }
        }

        System.out.println(max + " " + id);*/
    }
}
