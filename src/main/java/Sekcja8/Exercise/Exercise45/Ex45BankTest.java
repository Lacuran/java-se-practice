package Sekcja8.Exercise.Exercise45;

public class Ex45BankTest {

    public static void main(String[] args) {
        Bank bank = new Bank("NBP");

        bank.addBranch("Finanse");

        bank.addCustomer("Finanse","Kornel",123.34);
        bank.addCustomer("Finanse","Tomek",3.34);
        bank.addCustomer("Finanse","Maciek",12123.34);

        bank.addBranch("Vip Klienci");
        bank.addCustomer("Vip Klienci","Bob",123123.34);
        bank.addCustomer("Vip Klienci","Mike",12333.34);
        bank.addCustomer("Vip Klienci","Percy",9012123.34);

        bank.addCustomerTransaction("Finanse","Kornel", 600.00);
        bank.addCustomerTransaction("Finanse","Tomek", 1600.00);
        bank.addCustomerTransaction("Finanse","Kornel", 20.00);

        bank.listCustomers("Finanse",true);
        bank.listCustomers("Vip Klienci",true);


    }
}
