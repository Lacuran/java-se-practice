package NonMandatorySections.Sekcja10.Lesson;

import java.util.ArrayList;

public class Generic {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        
        printDoubled(items);
    }
    
    private static void printDoubled(ArrayList<Integer> n){
        for (int i: n) {
            System.out.println(i * 2);
        }
    }
}
