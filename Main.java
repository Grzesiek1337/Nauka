package com.grzes;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


       /* int x = 1;
        while (x < 3) {
            System.out.println("Doo");
            System.out.println("Bee");
            x = x + 1;}
        if (x == 3) {
            System.out.println("Do");
        } */

        /*int bottlesCount = 100;
        String słowo = "butelek";
        while (bottlescount > 0) {
            if (bottlesCount == 1) { słowo = "butelka"; }
            System.out.println(bottlesCount + " " + słowo+ " piwa stoi na murku.");
            System.out.println(bottlesCount + " " + słowo+ " piwka.");
            System.out.println("Jedno piwko sobie weź");
            System.out.println("Odejmij także też.");
            bottlesCount = bottlesCount - 1;
            if (bottlescount > 0) {
                System.out.println("Pozostało na murku " +bottlesCount+ " " +słowo+ " piwka." );
            } else {
                System.out.println("Nie ma już butelek piwka");
            } */

        String[] listWords1 = {"piękny", "śliczny", "kolorowy", "niesamowity", "zajebisty"};
        String[] listWords2 = {"kwiatek", "dzbanek", "kominek", "rodzyn", "herbatnik"};
        int listLenght1 = listWords1.length;
        int listLenght2 = listWords2.length;
         int randomWord1=(int) (Math.random() * listLenght1);
        int randomWord2 =(int) (Math.random() * listLenght2);
        String sentence = listWords1[randomWord2] + " " + listWords2[randomWord2];
        System.out.println(sentence);









        }


}
