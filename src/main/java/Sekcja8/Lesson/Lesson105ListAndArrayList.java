package Sekcja8.Lesson;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson105ListAndArrayList {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }


//        groceryList.printGroceryList();
//        System.out.println();
//
//        groceryList.addGroceryItem("Milk");
//        groceryList.addGroceryItem("Cheese");
//        groceryList.addGroceryItem("Bread");
//        groceryList.addGroceryItem("Sparkling Water");
//        groceryList.addGroceryItem("Butter");
//        groceryList.printGroceryList();
//        System.out.println();
//
//        groceryList.modifyGroceryItem(0,"Fat free Milk");
//        groceryList.printGroceryList();
//
//        System.out.println();
//        groceryList.removeGroceryItem(2);
//        groceryList.printGroceryList();
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To print the list and exit program");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter a grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }

    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println("You have " + newArray.size() + " items in your grocery list");
        for (int i = 0; i < newArray.size(); i++) {
            System.out.println((i+1) + ". " + newArray.get(i));
        }

//        ArrayList<String> nextArrayList = new ArrayList<>(groceryList.getGroceryList());
//
//        String[] myArray = new String[groceryList.getGroceryList().size()];
//        myArray = groceryList.getGroceryList().toArray(myArray);

    }
}
