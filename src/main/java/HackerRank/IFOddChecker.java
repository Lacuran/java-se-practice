package HackerRank;

import java.util.Scanner;

public class IFOddChecker {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        System.out.println(ifOddCheck(n));
        scanner.close();

    }

    private static String ifOddCheck(int n){
        return n % 2 == 1 ? "Weird" :
                n % 2 == 0 && n >= 2 && n <= 5 ? "Not Weird" :
                        n % 2 == 0 && n >= 6 && n <= 20 ? "Weird" :
                                /*n % 2 == 0 && n > 20 ?*/ "Not Weird";
    }
}

