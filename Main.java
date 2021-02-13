package com.grzes;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String klocek = "[  ]";
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj ilosc poziomow piramidy: ");
        int poziomy = sc.nextInt();

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < poziomy + 3 ; j++) {
                if (j < (poziomy - i) || j > (poziomy + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(klocek);
                }
            }
            System.out.println();
        }
        System.out.println("Nie siema nie żegam się.");
        System.out.println("A może jednak...");
    }
}