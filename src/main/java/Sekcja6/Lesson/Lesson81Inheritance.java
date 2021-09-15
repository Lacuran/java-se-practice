package Sekcja6.Lesson;

public class Lesson81Inheritance {

    public static void main(String[] args) {
        Lesson81Animal animal = new Lesson81Animal("Animal",1, 1,5,5);

        Lesson81Dog dog = new Lesson81Dog("Yourkie",8,20,2,4,1,20,"long silky");
//        dog.eat();
        dog.walk();
        dog.run();

    }
}
