package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    Scanner input = new Scanner(System.in);

    protected static void greetings() {
        System.out.println("Welcome to the task manger! \nWhat would you like to do? \n1.View tasks" +
                " \n2.Add a task \n3.Remove a Task \n4.Exit ");
    }

    protected static void mainMenu() {

        greetings();

        Scanner input = new Scanner(System.in);

        try {

            switch (input.nextInt()) {
                //View tasks
                case 1:


                    break;
                //add task
                case 2:

                    break;
                //remove task
                case 3:
                    break;
                //exit
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please pick a number between 1-5.");
                    mainMenu();
                    break;
            }


        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Invalid input. Try again.");
            mainMenu();
        }
    }

}
