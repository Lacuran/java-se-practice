package pl.globallogic.qaa_academy;

import java.util.Scanner;

public class ControlFlowAndExamples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();

        String messagetoPrint = number == 11 ? "You will be pair program with Olena" : "You will write your code with Alone";
        System.out.println(messagetoPrint);

        if (number == 11){
            if (number > 30){
                System.out.println("You are the Devil");
            }
            messagetoPrint = "You are lucky today";
        } else if (number == 7) {
            messagetoPrint = "You will pair program with Dima";
        } else {
            messagetoPrint = "Not your day";
        }
        System.out.println(messagetoPrint);

    }
}
