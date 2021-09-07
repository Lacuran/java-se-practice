package Sekcja4.Exercise;

public class Exercise1SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        return kilometersPerHour >= 0 ? Math.round(kilometersPerHour/1.609) : -1;
    }
    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" :
                (kilometersPerHour + " km/h = " + Math.round(kilometersPerHour/1.609) + " mi/h"));
    }
        /*
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mil/h");
            */



    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(0);
        printConversion(-1);
    }
}
