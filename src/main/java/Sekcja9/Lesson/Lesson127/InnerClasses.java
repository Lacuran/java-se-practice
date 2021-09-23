package Sekcja9.Lesson.Lesson127;

import java.util.Scanner;

public class InnerClasses {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//        GearBox maluch = new GearBox(6);
//
//        maluch.operateClutch(true);
//        maluch.changeGear(1);
//        maluch.operateClutch(false);
//        System.out.println(maluch.wheelSpeed(1000));
//        maluch.changeGear(2);
//        System.out.println(maluch.wheelSpeed(3000));
//        maluch.operateClutch(true);
//        maluch.changeGear(3);
//        maluch.operateClutch(false);
//        System.out.println(maluch.wheelSpeed(9000));

//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(String.format("%s was clicked", title));
//            }
//        }

        btnPrint.setOnClickLister(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title +" was clicked");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
