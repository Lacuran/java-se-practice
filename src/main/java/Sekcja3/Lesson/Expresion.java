package Sekcja3.Lesson;

public class Expresion {
    public static void main(String[] args) {

        int myFirstNumber = (5 + 10) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;

        System.out.println(myTotal);
        System.out.println(myLastOne);
    }
}
