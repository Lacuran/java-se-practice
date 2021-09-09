package Sekcja4.Exercise;

public class Exercise10EqualityPrinter {

    public static void printEqual(int numberOne, int numberTwo, int numberThree){
        if (numberOne < 0 || numberThree < 0 || numberTwo < 0){
            System.out.println("Invalid Value");
        } else if ((numberOne == numberTwo) && (numberOne == numberThree) && (numberThree == numberTwo)){
            System.out.println("All numbers are equal");
        } else if ((numberOne == numberTwo) || (numberOne == numberThree) || (numberThree == numberTwo)){
            System.out.println("Neither all are equal or different");
        }else {
            System.out.println("All numbers are different");
        }
    }

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(-1,1,1);
        printEqual(1,2,1);
        printEqual(1,2,3);
    }
}
