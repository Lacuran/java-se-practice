package Sekcja9.Lesson.Lesson130;

public class AbstractClass {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        System.out.println();

        Parrot parrot = new Parrot("Wróbelek");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        System.out.println();

        Penguin penguin = new Penguin("Empress");
        penguin.fly();
        penguin.eat();
        penguin.breath();
    }
}
