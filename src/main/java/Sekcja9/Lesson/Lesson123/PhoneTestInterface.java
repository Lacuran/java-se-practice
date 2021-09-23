package Sekcja9.Lesson.Lesson123;

public class PhoneTestInterface {
    public static void main(String[] args) {
        ITelephone kornelPhone;
        kornelPhone = new DeskPhone(928237434);

        kornelPhone.powerOn();
        kornelPhone.callPhone(928237434);
        kornelPhone.answer();

        System.out.println();

        kornelPhone = new MobilePhone(123456);
        kornelPhone.callPhone(123456);
        kornelPhone.answer();

    }
}
