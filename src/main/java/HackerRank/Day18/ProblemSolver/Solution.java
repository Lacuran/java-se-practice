package HackerRank.Day18.ProblemSolver;

import java.util.*;

public class Solution {

    LinkedList queue;
    Stack stack;

    public Solution() {
        this.queue = new LinkedList();
        this.stack = new Stack();
    }

    public void pushCharacter(char ch){
        stack.push(ch);
    }
    public char  popCharacter(){
        return (char) stack.pop();
    }

    public void enqueueCharacter(char ch){
        queue.addLast(ch);
    }

    public char dequeueCharacter(){
        return (char) queue.remove(0);
    }
}
