package Sekcja9.ChallengeAndExercise.Exercise47;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch125Test {

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println(String.format("Choose\n 1 to enter a string\n 0 to quit"));

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = new ArrayList<>();
        objectToLoad.read(values);
    }

    public static void main(String[] args) {
        Player kornel = new Player("Mlem", 10,15);
        System.out.println(kornel.toString());
        saveObject(kornel);

        System.out.println();

        kornel.setHitPoints(100);
        System.out.println(kornel);
        kornel.setWeapon("Mlem Sword");
        saveObject(kornel);
        loadObject(kornel);
        System.out.println(kornel);

        System.out.println();

        ISaveable werewolf = new Monster("Werewolf",20,40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
    }
}
