package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {


Scanner scanner = new Scanner(System.in);
boolean shouldContinue=true; //Ta pętla sie wykonuje

        Shop shop = new Shop();

        while(shouldContinue);
        System.out.println("Wybierz opcje: ");
        System.out.println("Wyswietl  nazwe instrumentu ");
        System.out.println("Podaj typ ");
        System.out.println("Podaj wielkosc ");
        System.out.println("5.Zakoncz ");

        //Wybieram sobie opcje numer dlatego jest int i wybieram scanera
         int userChoice= scanner.nextInt();
         
         // Switch przelaczam
        switch(userChoice)
        {
            // Tu wywoluje metody

            case 1->shop.displayInstrument();
            case 2-> shop.addInstrument();
            case 3 -> shop.displayTypes();
            case 4 -> shop.displaySize();
            case 5 -> shouldContinue=false;



        }


    }
}
