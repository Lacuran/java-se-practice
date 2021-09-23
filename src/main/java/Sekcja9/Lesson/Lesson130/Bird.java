package Sekcja9.Lesson.Lesson130;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s is peaking",getName()));
    }

    @Override
    public void breath() {
        System.out.println("Breathe in, breath out");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping cip cip cip");
    }
}
