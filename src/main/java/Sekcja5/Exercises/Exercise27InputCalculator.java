package Sekcja5.Exercises;

import java.util.Scanner;

public class Exercise27InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;

        while (true){
            boolean hasIntValue = scanner.hasNextInt();

            if (hasIntValue){
                int number = scanner.nextInt();
                sum += number;
                avg++;
            } else {
                break;
            }
        }
        if (avg == 0){
            System.out.println(String.format("SUM = %s AVG = %s",sum , avg));
        } else {
            System.out.println(String.format("SUM = %s AVG = %.0f",sum , (double) sum /avg));
        }

        scanner.close();
    }

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }
}
