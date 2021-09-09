package pl.globallogic.qaa_academy;

import java.util.Scanner;

public class LoopsDowhilefor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of guesses: ");
        int numberOfGuesses = scanner.nextInt();
        String messegeToPrint = "Try another day";

        for (int i = 0; i < numberOfGuesses; i++) {
            System.out.println("Please enter the number");
            int number = scanner.nextInt();
            switch (number){
                case 7:
                case 11:
                    messegeToPrint = "You are lucky!";
                    System.out.println(messegeToPrint);
                    break;
                default:
                    System.out.println(messegeToPrint);
            }
        }

        /*
        do {
            int number = scanner.nextInt();
            if (number == 11){
                messegeToPrint = "You are lucky today";
                break;
            } else {
                System.out.println("Try one more time");
            }
        } while (scanner.hasNextInt());

         */

        System.out.println(messegeToPrint);
    }
}
