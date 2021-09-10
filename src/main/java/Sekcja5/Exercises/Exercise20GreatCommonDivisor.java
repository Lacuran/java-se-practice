package Sekcja5.Exercises;

public class Exercise20GreatCommonDivisor {
//wykorzystano tu wzór Eukiledesa
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        while (first != second){
            if (first > second){
                first -= second;
            }else
                second -= first;
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(-1, 10));
        System.out.println(getGreatestCommonDivisor(10, -1));
        System.out.println(getGreatestCommonDivisor(25, 15));
    }
}
