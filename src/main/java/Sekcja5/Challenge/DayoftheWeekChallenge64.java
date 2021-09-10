package Sekcja5.Challenge;

public class DayoftheWeekChallenge64 {

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }

    public static String dayOfTheWeek(int day){
        return day == 1 ? "Monday from if" :
               day == 2 ? "Tuesday from if" :
               day == 3 ? "Wednesday from if" :
               day == 4 ? "Thursday from if" :
               day == 5 ? "Friday from if" :
               day == 6 ? "Saturday from if" :
               day == 7 ? "Sunday from if" :
               "Invalid Day from if";
    }

    public static void main(String[] args) {
        printDayOfTheWeek(5);
        printDayOfTheWeek(8);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(3);
        System.out.println(dayOfTheWeek(1));
        System.out.println(dayOfTheWeek(0));
        System.out.println(dayOfTheWeek(8));
        System.out.println(dayOfTheWeek(3));;
        System.out.println(dayOfTheWeek(4));
    }
}
