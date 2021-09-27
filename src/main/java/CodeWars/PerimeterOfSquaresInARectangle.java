package CodeWars;
/*
The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8.
It's easy to see that the sum of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

Could you give the sum of the perimeters of all the squares in a rectangle
when there are n + 1 squares disposed in the same manner as in the drawing:
 */

import java.math.BigInteger;

public class PerimeterOfSquaresInARectangle {

    public static BigInteger perimeter(BigInteger n) {

        BigInteger fibSum = BigInteger.ONE;
        BigInteger previousFibValue = BigInteger.ZERO;
        BigInteger currentFibValue = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(n) < 1; i = i.add(BigInteger.ONE)) {
            currentFibValue = currentFibValue.add(previousFibValue);
            previousFibValue = currentFibValue.subtract(previousFibValue);
            fibSum = fibSum.add(currentFibValue);
        }
        return fibSum.multiply(BigInteger.valueOf(4));
    }


    public static void main(String[] args) {

        System.out.println(perimeter(BigInteger.valueOf(5)));

    }
}
