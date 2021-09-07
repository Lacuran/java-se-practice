package pl.globallogic.qaa_academy;

import java.util.HashMap;

public class PrimitiveTypesExamples {

    byte b;
    {
        b = 3;
    }
    short s1 = 122;
    char c1 = 'c';//45
    int i1 = 1_000_000;
    long l1 = Long.MAX_VALUE;

    int numberOfRowsInATable = 10;
    double golden_ratio = 1.886;


    public static void main(String[] args) {
        int i1 = 3_123_213;
        short s1 = 32000;
        short s2 = 20000;
        short s4 = (short) (s1 + s2);
        int s3 = s1 + s2;
        System.out.println(s4);
        System.out.println(s3);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        float f1 = 232.23442f;
        long l1 = 10_000L;
        boolean b1 = !(true || true);
        l1 += 500;// the same as l1 = l1 + 500;
        System.out.println(b1);

        // ++,--,! unary operators
        // +,-,*,/,%,&,| binary operators
        // bool ? : ternary operators
    }
}
