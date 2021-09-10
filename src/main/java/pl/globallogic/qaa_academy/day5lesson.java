package pl.globallogic.qaa_academy;

import java.util.List;
import java.util.Scanner;

public class day5lesson {

    public static void prettyNastyFunction(){
        System.out.println("pretty nasty Function call");
    }

    public static void main(String[] args) {

        List<String> names = List.of("Jane", "Joe", "Jinn", "Dima");
        int [] number = new int[] {1, 2, 3, 4, 5};
        int sum = 0;
        for (int numbers: number) {
            sum+=numbers;
            System.out.println(sum);
        }
        for (int numbers : number){
            System.out.println("The number is " + numbers);
        }

//        for (String name : names){
//            System.out.println("The name is " + name);
//        }

        names.forEach(name -> System.out.println("The name is " + name));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the number of iteration: ");
//        int numberOfGuesses = scanner.nextInt();
//
//        for (int i = 0; i < numberOfGuesses; i++) {
//            if (i == 2) {
//                prettyNastyFunction();
//                System.out.println("Stepping out of the loop");
//                break;
//            }
//            System.out.println("Current iteration is " + i);
//        }

    }
}
