package Sekcja12.Lesson.CollectionAndBinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheatreTest {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olimpiada",8,12);
//        List<Theatre.>
    }

    public static void printList(List<Theatre> list){
        for (Theatre seat : list) {
//            System.out.print(" " + seat.getSeatNumber() + " " + seat.g);
        }
        System.out.println();
        System.out.println("===================================================");
    }

    /*public static void sortList(List<? extends Theatre.Seat> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }*/
}
