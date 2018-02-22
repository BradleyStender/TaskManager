package com.company;
import java.util.Scanner;
import java.util.ArrayList;



public class Tasks {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    ArrayList<String> tasks = new ArrayList<String>();


    protected void addingTasks(){

  System.out.println("What task would you like to add?");

//  while(true){
      tasks.add(input.nextLine());

Menu.mainMenu();
 // }

    }



    protected void viewTasks(){
        if(tasks .equals(null)){
            System.out.println("You have no tasks at the moment.");
        }else{
            System.out.println(tasks);
        }




    }



}


