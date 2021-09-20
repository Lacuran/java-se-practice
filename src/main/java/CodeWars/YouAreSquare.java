package CodeWars;
/*
Task
Given an integral number, determine if it's a square number:

In mathematics, a square number or perfect square is an integer that is the square of an integer;
in other words, it is the product of some integer with itself.
 */

public class YouAreSquare {

    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        } else if (n == 0) {
            return true;
        } else {
            for (int i = 1; i * i <= n; i++) {
                if ((n / i == i) && (n % i == 0)) {
                    return true;
                }
            }
            return false;
        }
    }



    public static void main(String[] args) {
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
    }
}
