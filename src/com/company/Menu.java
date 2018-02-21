package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

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
//                    System.out.println("What task would you like to add?");
//           //         String t = input.nextLine();
//
//                    System.out.println("These are the tasks you have now.");
//                    String[] array = new String[0];
//                    String test = Arrays.toString(array);
//                    System.out.println(test);
                    System.out.print("Enter how many tasks you would like to add: ");
                    Scanner scan = null;
                    int numOfTasks = Integer.parseInt(scan.nextLine());

                    //Create a string array to store the names of your friends
                    String arrayOfNames[] = new String[numOfTasks];
                    for (int i = 0; i < arrayOfNames.length; i++) {
                        System.out.print("Enter the task " + (i + 1) + " : ");
                        arrayOfNames[i] = scan.nextLine();
                    }

                    //Now show your friend's name one by one
                    for (int i = 0; i < arrayOfNames.length; i++) {
                        System.out.print("My tasks " + (i + 1) + " : ");
                        System.out.print(arrayOfNames[i] + "\n");

                    }
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
