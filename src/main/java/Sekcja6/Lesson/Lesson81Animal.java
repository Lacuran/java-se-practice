package Sekcja6.Lesson;

public class Lesson81Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Lesson81Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called, Nom Nom Nom");
    }

    public void move(int speed){
        System.out.println("Anmal.move() called, Dog move at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
