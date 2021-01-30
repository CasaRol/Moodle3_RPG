package com.experis;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here

        while(true) {
            display display = new display();
            Scanner scan = new Scanner(System.in);

            System.out.println("1: Generate Characters");
            System.out.println("2: Create weapons and Armor");
            System.out.println("3: Equip items to character");
            System.out.println("4: Change equipment on character");
            System.out.println("5: Simulate attack");
            System.out.println("404: Exit program");

            switch(scan.nextInt()) {
                case 1:
                    System.out.println("____________________");
                    display.displayLeveling();
                    System.out.println("____________________");
                    break;
                case 2:
                    System.out.println("____________________");
                    display.createItems();
                    System.out.println("____________________");
                    break;
                case 3:
                    System.out.println("____________________");
                    display.addItemsToHero();
                    System.out.println("____________________");
                    break;
                case 4:
                    System.out.println("____________________");
                    display.changeEquipment();
                    System.out.println("____________________");
                    break;
                case 5:
                    System.out.println("____________________");
                    display.attacking();
                    System.out.println("____________________");
                    break;
                case 404:
                    System.exit(0);
            }
        }

    }

}
