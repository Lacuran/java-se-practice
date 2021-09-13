package Sekcja5.Lesson;

import java.util.Scanner;

public class Lesson72ReadingInputUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character

            System.out.println("Enter Your name: ");
            String name = scanner.nextLine();

            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " year old.");
            } else {
                System.out.println("Invalid year of Birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
