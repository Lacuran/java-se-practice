package Sekcja5.Challenge;

public class Challenge67Sum3and5 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000 ; i++) {
            if (i % 3 == 0 && i % 5 ==0){
                sum += i;
                System.out.println("Number that is divided by 3 and 5: " + i);
                count++;
            }
            if (count == 5){
                System.out.println("Leaving loop");
                break;
            }
        }
        System.out.println("Value of sum numbers: " + sum);
    }
}
