package Sekcja8.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise42MinimumElement {

    private static int readInteger(){
        System.out.println("Give number of elements in the array: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            System.out.println("In Index: " + i + ". Number: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array){
        Arrays.sort(array);
        System.out.println("Min Value of Array is: ");
        return array[0];
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(readElements(readInteger())));
        System.out.println(findMin(readElements(readInteger())));
    }


}
