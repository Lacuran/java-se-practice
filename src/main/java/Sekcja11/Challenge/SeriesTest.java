package Sekcja11.Challenge;

public class SeriesTest {

    public static void main(String[] args) {

//        System.out.println(Series.nSum(10));
//        System.out.println();
//        System.out.println(Series.factorial(10));
//        System.out.println();
//        System.out.println(Series.fibonacci(10));
//        System.out.println(Series.fibonacci(2));

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println();

        for (int i = 0; i <= 7; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
