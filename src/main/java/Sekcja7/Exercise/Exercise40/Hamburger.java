package Sekcja7.Exercise.Exercise40;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(String.format("%s hamburger on a %s roll with %s, price is %s",this.name, this.breadRollType,this.meat, this.price ));
    }

    private String addition1Name;
    private double addition1Price;

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        System.out.println(String.format("Added %s for an extra %s", this.addition1Name, this.addition1Price));
        this.price += this.addition1Price;
    }

    private String addition2Name;
    private double addition2Price;

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        System.out.println(String.format("Added %s for an extra %s", this.addition2Name, this.addition2Price));
        this.price += this.addition2Price;
    }
    private String addition3Name;
    private double addition3Price;

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        System.out.println(String.format("Added %s for an extra %s", this.addition3Name, this.addition3Price));
        this.price += this.addition3Price;
    }
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        System.out.println(String.format("Added %s for an extra %s", this.addition4Name, this.addition4Price));
        this.price += this.addition4Price;
    }

    public double itemizeHamburger(){
        return this.price;
    }

}
