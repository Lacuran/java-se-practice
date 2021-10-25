package HackerRank.Day18.Tutorial;

public class Mainymain {

    public static void main(String[] args) {

        Queuey queuey = new Queuey();
        queuey.enqueue("Melm");
        queuey.enqueue("this");
        queuey.enqueue("hi");

        System.out.println("First out: " + queuey.dequeue());
        System.out.println("Peek second: " + queuey.peek());
        System.out.println("Second out: " + queuey.dequeue());
        System.out.println("third out: " + queuey.dequeue());
    }
}
