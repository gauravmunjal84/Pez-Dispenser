package com.teamtreehouse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("We are making a new PEZ Dispenser !");
        PezDispenser dispenser = new PezDispenser("Vanya");
        System.out.printf("Dispenser character is %s%n",
                            dispenser.getCharacterName()
        );
    }
}
