package Sekcja4.Lesson;

public class MethodOverloading58 {

    public static int calculateScore(String playerNamer, int score){
        System.out.println("Player " + playerNamer + " score " + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player score " + score);
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        return feet < 0 || (inches <0 || inches >12) ? -1
                : (((feet * 12) * 2.54) + inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches <0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remaningInches = (int) inches % 12;
        System.out.println(inches * 2.54);
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remaningInches);
        return calcFeetAndInchesToCentimeters(feet, remaningInches);
    }

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New scire is: " + newScore);
        calculateScore("Konel", 500);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(-1,5));
        System.out.println(calcFeetAndInchesToCentimeters(0,1));
        calcFeetAndInchesToCentimeters(157);
        System.out.println(calcFeetAndInchesToCentimeters(13,1));
    }
}
