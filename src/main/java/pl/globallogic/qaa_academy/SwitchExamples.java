package pl.globallogic.qaa_academy;

import java.util.Scanner;

public class SwitchExamples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        String messageToPrint = switch (number){
            case 7, 11 -> {
                prettyNastyMessage();
                yield "You will pair program with Dima";
            }
            default -> "You will work alone";
        };
        /*
        switch (number){
            case 11: messageToPrint = "You will be lucky today"; break;
            case 7: messageToPrint = "You will pair program with Dima"; break;
            default: messageToPrint = "You will work Alone!!!";
        }
        */
        System.out.println(messageToPrint);

    }

    private static void prettyNastyMessage(){

    }
}
