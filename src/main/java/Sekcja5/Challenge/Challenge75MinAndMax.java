package Sekcja5.Challenge;

import java.util.Scanner;

public class Challenge75MinAndMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minNumber = 0; // second method is to set this value to the highest possible
        int maxNumber = 0;
        boolean flagFirst = true;

        while (true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int number = scanner.nextInt();

                if (flagFirst){
                    flagFirst = false;
                    minNumber = number;
                    maxNumber = number;
                }

                if (number > maxNumber){
                    maxNumber = number;
                }
                if (number < minNumber){
                    minNumber = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }

        System.out.println(String.format("Your min = %s, max = %s", minNumber, maxNumber));
        scanner.close();
    }
}
