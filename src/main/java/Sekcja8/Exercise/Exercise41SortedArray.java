package Sekcja8.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise41SortedArray {

    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(String.format("Element %s contents %s",i ,array[i]));
        }
    }

    public static int[] sortIntegers(int[] array){

        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] myArrayList = getIntegers(5);

        printArray(myArrayList);
        System.out.println("\n---------------------------------\n");
        printArray(sortIntegers(myArrayList));
    }
}
