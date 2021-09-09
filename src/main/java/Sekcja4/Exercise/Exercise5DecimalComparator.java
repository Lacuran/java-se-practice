package Sekcja4.Exercise;

public class Exercise5DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        int checkFirstNumber = (int) (firstNumber * 1000);
        int checkSecondNumber = (int) (secondNumber * 1000);
        if (checkFirstNumber == checkSecondNumber){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
