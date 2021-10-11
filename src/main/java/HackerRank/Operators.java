package HackerRank;

public class Operators {
    public static void main(String[] args) {

        solve(12.00,20,8);
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double result = 0;
        result = meal_cost + ((meal_cost/100) * tax_percent) +  ((meal_cost/100) * tip_percent);
        System.out.println(String.format("%.0f",result));
    }
}
