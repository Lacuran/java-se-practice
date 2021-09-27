package Sekcja11.Lesson;

public class Scope {
    public int publicVar = 0;
    private int privateVar = 1;

    public Scope(){
        System.out.println(String.format("ScopeCheck created, publicVar = %s: privateVar = %s",publicVar, privateVar));
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%s times two is %s",i,i * privateVar));
        }
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass(){
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo() {
//            int privateVar = 2;
            for (int i = 0; i < 10; i++) {
                System.out.println(String.format("%s times two is %s",i,i * privateVar));
            }
        }
    }
}
