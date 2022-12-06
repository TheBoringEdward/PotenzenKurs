package de.edward;

import java.util.Scanner;

public class Main {

    Scanner scn2 = new Scanner(System.in);

    double power(double b, int e){
        if (e > 0){
            return b * power(b,e-1); // This is screwing with my brain.
        } else {
            return 1;
        }
    }

    int fib(int e){ // e = number of months
        if (e > 2){
            return fib(e-1) + fib(e-2);
            // 01 01 02 03 05 08 13
            // adds the last two values to receive the new value
        } else {
            return 1;
        }
    }

    void resultsPower(){
        System.out.println("Please enter the double.");
        double b = scn2.nextDouble();
        System.out.println("Please enter the integer.");
        int e = scn2.nextInt();
        System.out.println(power(b, e));
    }

    void resultsFib(){
        System.out.println("Please enter the integer count for months.");
        int e = scn2.nextInt();
        System.out.println(fib(e));
    }

    void option(){
        System.out.println("Please enter 1 for calculating powers, 2 for knnchn");
        int e = scn2.nextInt();
        switch(e){
            default -> System.out.println("Invalid option");
            case 1 -> {
                resultsPower();
            }
            case 2 -> {
                resultsFib();
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.option();
        System.out.print("\n ======= This code has been provided by TheBoringEdward =======\n");
    }
}
