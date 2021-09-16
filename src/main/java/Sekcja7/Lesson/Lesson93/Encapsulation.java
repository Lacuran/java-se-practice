package Sekcja7.Lesson.Lesson93;

public class Encapsulation {

    public static void main(String[] args) {

//        Player player = new Player();

//        player.name = "Kornel";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(String.format("Reaming health = %s", player.healthRemaining()));
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println(String.format("Reaming health = %s", player.healthRemaining()));

        EnhancedPlayer player = new EnhancedPlayer("Kornel", 200, "Sword");
        System.out.println(String.format("Initial health is " + player.getHitPoints()));
    }
}
