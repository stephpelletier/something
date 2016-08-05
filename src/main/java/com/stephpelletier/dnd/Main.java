package com.stephpelletier.dnd;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        System.out.println("Hello you!");

        Scanner inputScanner = new Scanner(System.in);

        boolean isLive = true;
        while(isLive){
            System.out.println("To create a new character, press 1.");
            System.out.println("To create exit, press 0.");

            int input = inputScanner.nextInt();
            switch (input) {
                case 1:
                    Character character = new Character();
                    System.out.println("Strengh: "+character.getStrength());
                    System.out.println("Dexterity: "+character.getDexterity());
                    System.out.println("Intelligence: "+character.getIntelligence());
                    System.out.println("Constitution: "+character.getConstitution());
                    System.out.println("Charisma: "+character.getCharisma());
                    System.out.println("Wisdom: "+character.getWisdom());
                    break;
                case 0:
                    isLive = false;
                    break;
            }
        }

        System.out.println("Good bye");
    }
}
