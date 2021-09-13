package Sekcja5.Exercises;

public class Exercise25LargestPrime {

    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                number /= i;
                i--;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(5));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(90));
        System.out.println(getLargestPrime(72));
    }
}
