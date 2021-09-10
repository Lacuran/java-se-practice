package Sekcja5.Exercises;

public class Exercise15NumberPalidrom {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int num = number;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
            if (reverse == number){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11211));
        System.out.println(isPalindrome(-1221));
    }
}
