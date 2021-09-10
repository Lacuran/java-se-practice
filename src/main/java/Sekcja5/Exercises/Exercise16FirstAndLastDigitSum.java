package Sekcja5.Exercises;

public class Exercise16FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;


        int lastDigit = number % 10;
        while (number > 9){
            number /= 10;
        }

        return lastDigit + number;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1221));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-1));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(1));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(123));
    }
}
