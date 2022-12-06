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

    int fact(int e){
        if (e > 0){
            return e * fact(e-1);
        } else {
            return 1;
        }
    }

    int tower(int a, int b){
        if (b == 0){
            return 0;
        }
        if(b%2 == 0){ // if b is even
            return tower(a*2,b/2); // no clue what exactly this is supposed to do
        }
        return a + tower(a*2,b/2);
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

    void resultsFact(){
        System.out.println("Please enter an integer.");
        int e = scn2.nextInt();
        System.out.println(fact(e));
    }

    void resultsTower(){
        System.out.println("Please enter an integer for a.");
        int a = scn2.nextInt();
        System.out.println("Please enter an integer for b.");
        int b = scn2.nextInt();
        System.out.println(tower(a,b));
    }

    void option(){
        System.out.println("Please enter \n1 for Power \n2 for Fib \n3 for Fact \n4 for Tower");
        int e = scn2.nextInt();
        switch(e){
            default -> System.out.println("Invalid option");
            case 1 -> {
                resultsPower();
            }
            case 2 -> {
                resultsFib();
            }
            case 3 -> {
                resultsFact();
            }
            case 4 -> {
                resultsTower();
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.option();
        System.out.print("\n ======= This code has been provided by TheBoringEdward =======\n");
    }
}
