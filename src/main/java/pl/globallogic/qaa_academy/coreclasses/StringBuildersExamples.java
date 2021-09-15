package pl.globallogic.qaa_academy.coreclasses;

public class StringBuildersExamples {

    public static void main(String[] args) {

        //StringBuffer for multi thread environment object
        //StringBuilder One object to work on

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder("This can be a long long text");

        sb3.append(" and we can change the content of this object");
//        sb3.insert(0," and we can change the content of this object");
//        System.out.println(sb3.toString());
//        sb3.setCharAt(2,'t');
//        sb3.reverse();
        int lastInedxOfObject = sb3.lastIndexOf("object");
        sb3.substring(0);
        System.out.println(lastInedxOfObject);
        System.out.println(sb3);

    }
}
