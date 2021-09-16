package Sekcja7.Challenge.Challenge94;

public class Challenge94Test {

    public static void main(String[] args) {

        Printer printer = new Printer(50,false);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);

        System.out.println(String.format("Pages printed was %s, new total print count for printer = %s",pagesPrinted,printer.getPagesPrinted()));

        pagesPrinted = printer.printPages(2);
        System.out.println(String.format("Pages printed was %s, new total print count for printer = %s",pagesPrinted,printer.getPagesPrinted()));
    }
}
