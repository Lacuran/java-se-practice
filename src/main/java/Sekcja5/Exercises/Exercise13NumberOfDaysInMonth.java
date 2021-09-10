package Sekcja5.Exercises;

import java.text.DecimalFormat;

public class Exercise13NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        return year < 1 || year > 9999 ? false : ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? true : false;
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 1 || month > 12) || (year < 1 || year > 9999))
            return -1;
        if (isLeapYear(year) && month == 2){
            return 29;
        }
        switch (month) {
            case 11:
            case 4:
            case 6:
            case 9:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2000));
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(5,2000));
        System.out.println(getDaysInMonth(2,1999));
    }
}
