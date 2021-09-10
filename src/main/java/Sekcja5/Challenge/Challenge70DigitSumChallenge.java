package Sekcja5.Challenge;

public class Challenge70DigitSumChallenge {

    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(11));
        System.out.println(sumDigits(15));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(123456789));
    }
}
