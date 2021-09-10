package Sekcja5.Challenge;

public class Challenge63WithSwitch {

    public static void main(String[] args) {

        char myChar= 'B';

        switch (myChar){
            case 'A':
                System.out.println("This is a Letter A");
                break;
            case 'B':
                System.out.println("This is a letter B");
                break;
            case 'C':
                System.out.println("This is a letter C");
                break;
            case 'D': case 'E':
                System.out.println("This is a letter " + myChar);
                break;
            default:
                System.out.println("None of this latter doest not fit my guess");
                break;
        }
    }
}
