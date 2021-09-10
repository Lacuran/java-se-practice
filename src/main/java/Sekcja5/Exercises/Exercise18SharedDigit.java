package Sekcja5.Exercises;

public class Exercise18SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo){
        if ((numberOne < 10 || numberOne > 99) || (numberTwo < 10 || numberTwo > 99)){
            return false;
        }
        int firstDigit = numberOne / 10;
        int secondDigit = numberOne % 10;
        int thirdDigit = numberTwo / 10;
        int fourthDigit = numberTwo % 10;

        return (firstDigit == thirdDigit) || (secondDigit == fourthDigit) || (firstDigit == fourthDigit) || (secondDigit == thirdDigit);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(99,9));
        System.out.println(hasSharedDigit(10,99));
        System.out.println(hasSharedDigit(11,21));


    }
}
