package HackerRank.Day17;

public class Calculator {

    public int power(int a, int b) throws NegativeException {
        if (a < 0 || b < 0){
            throw new NegativeException("n and p should be non-negative");
        }
        return (int) Math.pow(a,b);
    }
}
