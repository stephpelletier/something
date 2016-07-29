package com.stephpelletier.dnd;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        System.out.println("Hello you!");
        System.out.println("To create a new character, press 1.");
        System.out.println("To create exit, press 0.");

        Scanner inputScanner = new Scanner(System.in);

        boolean isLive = true;
        while(isLive){
            int input = inputScanner.nextInt();

            switch (input) {
                case 1:
                    Character character = new Character();
                case 0:
                    isLive = false;
                    break;
            }
        }

        System.out.println("Good bye");
    }
}
