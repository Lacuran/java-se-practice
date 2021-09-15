package Sekcja6.Challenge.Challenge88;

public class Challenge88InheritanceTest {

    public static void main(String[] args) {

        Maluch maluch = new Maluch(1200);
        maluch.steer(45);
        maluch.accelerate(30);
        maluch.accelerate(20);
        maluch.accelerate(-42);
        maluch.stop();
    }
}
