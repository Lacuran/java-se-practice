package Sekcja5.Exercises;

public class Exercise24FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if (bigCount * 5 + smallCount < goal){
            return false;
        }
        return (goal % 5 <= smallCount);
    }


    public static void main(String[] args) {
        System.out.println(canPack(2,0,10));
        System.out.println(canPack(1,4,10));
        System.out.println(canPack(3,5,-1));
        System.out.println(canPack(0,3,2));
    }
}
