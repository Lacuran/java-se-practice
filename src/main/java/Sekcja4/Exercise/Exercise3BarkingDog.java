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
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(true,4));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
    }
}
