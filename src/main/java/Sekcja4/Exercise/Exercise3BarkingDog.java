package Sekcja4.Exercise;

public class Exercise3BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        return hourOfDay < 0 || hourOfDay > 23 ? false
                : barking && hourOfDay < 8 || hourOfDay > 22 ? true
                : !barking && hourOfDay > 8 || hourOfDay < 22 ? false
                : false;
        /*
        if (hourOfDay < 0 || hourOfDay > 23){
            System.out.println(false);
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22){
            System.out.println(true);
            return true;
        } else if (!barking && hourOfDay > 8 || hourOfDay < 22){
            System.out.println(false);
            return false;
        }

        return false;

         */
    }

    public static void main(String[] args) {
        shouldWakeUp(true,1);
        shouldWakeUp(true,4);
        shouldWakeUp(false,2);
        shouldWakeUp(true,8);
        shouldWakeUp(true,-1);
    }
}
