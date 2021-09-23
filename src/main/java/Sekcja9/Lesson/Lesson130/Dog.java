package Sekcja9.Lesson.Lesson130;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is Eating");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }
}
