package Sekcja4.Exercise;

public class Exercise4YearLeapCalculator {

    public static boolean isLeapYear(int year){
        return year < 1 || year > 9999 ? false : ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2700));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
