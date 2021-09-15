package Sekcja6.Challenge.Challenge79;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("5675", 2.5, "Default name","default email","default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account Constructor called");
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.43, customerName, email, phoneNumber);
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double money){
        this.balance += money;
        System.out.println(String.format("You add %s to your account, Your balance is now: %s", money, this.balance));
    }

    public void withdrawFunds(double money){
        if ( money > this.balance){
            System.out.println("Insufficient Founds");
        } else {
            this.balance -= money;
            System.out.println(String.format("You withdraw %s from your account, Your balance is %s.", money, this.balance));
        }
    }
}
