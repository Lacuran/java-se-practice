package pl.globallogic.qaa_academy.coreclasses;

import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {

        String quote = "Good bad bad good good bad";
        String name = "Kornel";
        String name2 = "Kornel   ";
        String name3 = new String("Kornel");
        String name1 = new String("Jane");
        char[] nameByChars = new char[]{' ', 'a', 'b', 'c', '3'};
        String stringFromCharArray = new String (nameByChars);
        System.out.println(name.equals(name2));
        name2 = name2.trim();
        name3 = name3.intern();



        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name == name3);
        System.out.println(name.equals(name3));
        System.out.println(name.length());
        System.out.println(name.charAt(name.length()-5));
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(quote.replace("bad", "mlem mlem"));
        System.out.println(quote.isEmpty());
        System.out.println(quote.isBlank());
        System.out.println(quote.startsWith("Good"));
        System.out.println(quote.endsWith("bad"));
        String car = "car";
        String vehicle = "vehicle";
        System.out.println(String.format("This %s is a great %s and it goes %s with %s", vehicle, car, quote, name));
        name = quote.concat(name);
        System.out.println(name);
    }
}
