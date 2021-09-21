package Sekcja8.Lesson;

import java.util.ArrayList;

public class Lesson116LinkedList {

    public static void main(String[] args) {
        Customer customer = new Customer("Kornel", 43.00);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.43);

        //System.out.println(String.format("Balance for customer %s is %s", customer.getName(), customer.getBalance()));

        ArrayList<Integer> intList = new ArrayList<>();
        
        intList.add(1);
        intList.add(5);
        intList.add(3);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(String.format("%s: %s", i, intList.get(i)));
        }
        System.out.println();

        intList.add(1,45);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(String.format("%s: %s", i, intList.get(i)));
        }
    }
}
