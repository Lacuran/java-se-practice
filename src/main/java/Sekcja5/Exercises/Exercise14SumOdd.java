package Sekcja5.Exercises;

public class Exercise14SumOdd {

    public static boolean isOdd(int number){
        return number < 0 ? false : number % 2 == 0 ? false :true;
    }

    public static int sumOdd(int start, int end){
        if ((end < start) || (start < 0 || end < 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)){
                sum +=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(1));
        System.out.println(isOdd(2));
        System.out.println(isOdd(0));
        System.out.println(isOdd(-1));
        System.out.println(isOdd(5));
        System.out.println("");
        System.out.println("*********************");
        System.out.println("");
        System.out.println(sumOdd(10,6));
        System.out.println(sumOdd(1,10));
        System.out.println(sumOdd(-10,9));
        System.out.println(sumOdd(2,20));
    }
}
