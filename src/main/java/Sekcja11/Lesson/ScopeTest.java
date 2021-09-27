package Sekcja11.Lesson;

public class ScopeTest {

    public static void main(String[] args) {
        String privateVar = "this is private main()";

        Scope scopeInstance = new Scope();
        System.out.println("ScopeInstance privateCar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println("*******************************************");
        System.out.println();

        Scope.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
