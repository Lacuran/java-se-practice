package Sekcja4.Exercise;

public class Exercise7TeenNumberChecker {

    public static boolean hasTeen(int age1, int age2, int age3){
        return (age1 >=13 && age1 <=19)
                || (age2 >=13 && age2 <=19)
                || (age3 >=13 && age3 <=19);
    }
    public static boolean isTeen(int ageChecker){
        return ageChecker >= 13 && ageChecker <=19;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(22,23,34));
        System.out.println(isTeen(20));
        System.out.println(isTeen(19));
        System.out.println(isTeen(13));
        System.out.println(isTeen(12));
    }
}
