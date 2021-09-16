package Sekcja7.Exercise.Exercise40;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");

    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        System.out.println(String.format("Added %s for an extra %s", this.healthyExtra1Name, this.healthyExtra1Price));
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
        System.out.println(String.format("Added %s for an extra %s", this.healthyExtra2Name, this.healthyExtra2Price));
    }

    @Override
    public double itemizeHamburger() {
        return this.healthyExtra1Price + this. healthyExtra2Price + super.itemizeHamburger();
    }
}