package Sekcja7.Challenge;

public class Challenge79Constructors {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("12 2456 3333 3333 2222 1245 1245");
        bankAccount.setCustomerName("Kornel W.");
        bankAccount.setEmail("mlemmlem@mail.com");
        bankAccount.setPhoneNumber("555-12-34-56");

        BankAccount bobsAccount = new BankAccount("1234", 12.5, "Bob", "bob@email.com"," 12-432-4324-54");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println("-----------------------------");

        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println("-------------------------------");

        bankAccount.depositFunds(2000.49);
        bankAccount.depositFunds(123);
        //System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(2123.49);
        bankAccount.withdrawFunds(1);
    }
}
