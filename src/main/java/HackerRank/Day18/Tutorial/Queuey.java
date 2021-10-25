package HackerRank.Day18.Tutorial;

import java.util.LinkedList;

public class Queuey {
    LinkedList queue;

    public Queuey() {
        this.queue = new LinkedList();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void enqueue(String n){
        queue.addLast(n);
    }

    public int size(){
        return queue.size();
    }

    public String dequeue(){
        return (String) queue.remove(0);
    }

    public String peek(){
        return (String) queue.getFirst();
    }
}
