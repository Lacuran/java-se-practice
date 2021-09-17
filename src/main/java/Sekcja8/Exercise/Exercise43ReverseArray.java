package Sekcja8.Exercise;

import java.util.Arrays;

public class Exercise43ReverseArray {

    private static void reverse(int[] array){
        int[] reverseArray = new int[array.length];

        System.out.println("Array = " + Arrays.toString(array));

        for (int i = array.length-1, j = 0;i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }
        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }

    public static void main(String[] args) {
        int[] array = new int[] {5,3,2,4,7};
        reverse(array);

        int[] array2 = new int[] {4,578,123,6,3,5,690,4523,765};
        reverse(array2);
    }
}
