package de.edward;

import java.util.Scanner;

public class Main {

    Scanner scn2 = new Scanner(System.in);

    double potenz(double b, int e){
        if (e > 0){
            return b * potenz(b,e-1); // This is screwing with my brain.
        } else {
            return 1;
        }
    }

    void results(){
        System.out.println("Please enter the double.");
        double b = scn2.nextDouble();
        System.out.println("Please enter the integer.");
        int e = scn2.nextInt();
        System.out.println(potenz(b, e));
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.results();
        System.out.print("\n\n ======= This code has been provided by TheBoringEdward =======\n");
    }
}
