package HackerRank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaLoops {

    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();



        /*for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;
            for (int j = 0; j < n; j++) {
                c += Math.pow(2,j)*b;
                System.out.print(c + " ");
            }
            System.out.println();
        }*/

        /*int result = 0;
        for (int i = 1; i < 11; i++){
            System.out.println(String.format("%s x %s = %s", t, i, result=t*i));
        }*/

        /*while(n > 0) {
            System.out.print(arr[--n] + " ");
        }
        System.out.println("");*/

        /*Map<String, Integer> phoneBook = new HashMap<>();
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.get(s) == null){
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }*/



        in.close();
    }

    public static int factorial(int n) {
        if(n <= 2){
            return n;
        }
        return n * factorial(n - 1);
    }
}
