package Sekcja11.Lesson;

public class AccountTest {

    public static void main(String[] args) {

        Account kornelAccount = new Account("Kornel Account");

        kornelAccount.deposit(1000);
        kornelAccount.withdraw(200);
        kornelAccount.withdraw(-500);
        kornelAccount.deposit(-20);
        kornelAccount.calculateBalance();
//        kornelAccount.balance = 5000;

        System.out.println("Balance on account is " + kornelAccount.getBalance());
    }
}
