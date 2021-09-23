package Sekcja9.Lesson.Lesson130;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Imma gonna swim instead");
    }
}
