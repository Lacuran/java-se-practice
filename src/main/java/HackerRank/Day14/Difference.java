package HackerRank.Day14;

import java.util.Arrays;
import java.util.Collections;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = (elements[0] - elements[elements.length-1]) * -1;
    }

    public static void main(String[] args) {
        Difference difference = new Difference(new int[] {1,2,5});
        difference.computeDifference();
    }
}
