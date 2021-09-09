package Sekcja4.Exercise;

public class Exercise9MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long year = minutes / 525600;
            long day = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }


    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
