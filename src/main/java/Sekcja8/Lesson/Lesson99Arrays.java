package Sekcja8.Lesson;

import java.util.Scanner;

public class Lesson99Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println(String.format("Element %s, typed value was %s",i , myIntegers[i]));
        }

        System.out.println(String.format("The average is %s", getAverage(myIntegers)));
    }

    public static int[] getIntegers(int number){
        System.out.println(String.format("Enter %s integer values.\r", number));
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
