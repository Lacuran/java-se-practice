package Sekcja7.Exercise.Exercise40;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
        double chips = 2.75;
        double drink = 1.81;
        System.out.println(String.format("Added Chips for an extra %s", chips));
        System.out.println(String.format("Added Drink for an extra %s", drink));
        super.itemizeHamburger();
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

}
