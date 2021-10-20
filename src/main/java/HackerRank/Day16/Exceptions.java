package HackerRank.Day16;

public class Exceptions {

    public static void main(String[] args) {

        String S = "235";

        try {
            System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException ex) {
            System.out.println("Bad String");
        }
    }
}
