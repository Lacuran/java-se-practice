package Sekcja5.Challenge;

import java.util.Scanner;

public class Challenge74ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();

        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
            if (hasNextInt){
                System.out.println("Entered number#" + (i + 1));

            } else {
                System.out.println("Invalid Number");
                break;
            }

        }
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        System.out.println("Twoja suma: " + sum);

        scanner.close();
    }
}
