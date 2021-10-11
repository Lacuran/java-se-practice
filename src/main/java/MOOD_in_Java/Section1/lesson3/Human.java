package MOOD_in_Java.Section1.lesson3;

public class Human {

    String name;
    int age;
    int heightItInches;
    String eyeColor;

    public Human(String name, int age, int heightItInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightItInches = heightItInches;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightItInches + " inches long");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eat(){
        System.out.println("Nom nom nom");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void work(){
        System.out.println("Work work...");
    }
}
