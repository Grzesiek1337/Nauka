package com.grzes;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        question();


    }

    public static void question() {
        Scanner scanner = new Scanner(System.in);
        int hitCounts = 0;

        boolean capitol = false;
        while (!capitol) {
            System.out.println("Jakie miasto to obecnie stolica Polski?");
            String answer = scanner.nextLine();
            if (answer.equals("Warszawa")) {
                System.out.println("Brawo,to jest poprawna odpowiedź!");
                System.out.println("Udało Ci się za "+hitCounts+" razem!");
                capitol = true;
            } else  {
                System.out.println("Nieprawda! Spróbuj znowu.");
                hitCounts++;


            }

        }

    }


}