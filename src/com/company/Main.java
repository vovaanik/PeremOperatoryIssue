package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean registered = false;

            int percent;
            if (registered) {
                percent = 3;
        }   else {
                percent = 1;
            }
        long amount = 100060; // dve poslednih tsyfry - kopeiki
        long bonus = amount * percent/100/100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(bonus);
    }
}
