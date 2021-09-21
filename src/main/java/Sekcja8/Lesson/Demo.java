package Sekcja8.Lesson;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Warsaw");
        addInOrder(placesToVisit,"Krakow");
        addInOrder(placesToVisit,"Berlin");
        addInOrder(placesToVisit,"Paris");
        addInOrder(placesToVisit,"Dubai");
        addInOrder(placesToVisit,"Mielec");
        addInOrder(placesToVisit,"Tarnow");
        printList(placesToVisit);

        addInOrder(placesToVisit,"Mielec");
        addInOrder(placesToVisit, "Anigo");
        addInOrder(placesToVisit,"Zero");
        printList(placesToVisit);
        visit(placesToVisit);




//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Berlin");
//        placesToVisit.add("Dublin");
//        placesToVisit.add("New York");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Warsaw");
//        placesToVisit.add(0,"Paris");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println(String.format("Now visiting %s", i.next()));
        }
        System.out.println("=============================================");
        System.out.println();
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        printMenu();
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities is in the itenerary");
            return;
        } else {
            System.out.println("Now visiting" + listIterator.next());
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.hasPrevious());
                    } else {
                        System.out.println("Reached the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu");
    }
}
