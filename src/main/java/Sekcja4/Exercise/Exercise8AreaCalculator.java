package Sekcja4.Exercise;

public class Exercise8AreaCalculator {

    public static double area(double radius){
        return radius < 0 ? - 1 : radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        return (x < 0 || y < 0) ? -1 : x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5,6));
        System.out.println(area(-1,2));
    }
}
