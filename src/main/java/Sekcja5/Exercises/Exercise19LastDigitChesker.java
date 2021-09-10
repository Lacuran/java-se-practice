package Sekcja5.Exercises;

public class Exercise19LastDigitChesker {

    public static boolean hasSameLastDigit(int x, int y, int z){
        if (!(isValid(x)) || !(isValid(y)) || !(isValid(z))){
            return false;
        } else
            return (x % 10 == y % 10) || (x % 10 == z % 10) || (z % 10 == y % 10);
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000 ;
    }

    public static void main(String[] args) {
        System.out.println(isValid(9));
        System.out.println(isValid(19));
        System.out.println(isValid(999));
        System.out.println(hasSameLastDigit(9,19,99));

        int number = 999;
        int sum = 0;
        sum = number % 10;
        System.out.println(sum);
    }
}
