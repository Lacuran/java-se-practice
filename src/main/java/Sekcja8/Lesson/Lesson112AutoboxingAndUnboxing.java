package Sekcja8.Lesson;

import java.util.ArrayList;

//class IntClass{
//    private int myValue;
//
//    public IntClass(int myValue) {
//        this.myValue = myValue;
//    }
//
//    public int getMyValue() {
//        return myValue;
//    }
//
//    public void setMyValue(int myValue) {
//        this.myValue = myValue;
//    }
//}

public class Lesson112AutoboxingAndUnboxing {

    public static void main(String[] args) {
        String[] myArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();

//        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
//        intClassArrayList.add(new IntClass(42));

//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(12.43);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        //autoboxing
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        //unboxing
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 46; // Integer.valueOf(56); <- to samo
        int myInt = myIntValue; // myIntValue.intValue();
        
        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10.0 ; dbl += 0.5) {
            myDoubleValues.add(dbl); //myDoubleValues.add(Double.valueOf(dbl)); <- java sama dodaje .valueOf
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); //myDoubleValues.get(i).doubleValue(); <- java sama dodaje .valueOf
            System.out.println(i + " --> " + value);
        }
    }
}
