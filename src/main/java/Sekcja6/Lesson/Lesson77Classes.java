package Sekcja6.Lesson;

public class Lesson77Classes {

    public static void main(String[] args) {

        Lesson77Car porsche = new Lesson77Car();
        Lesson77Car holder = new Lesson77Car();

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
