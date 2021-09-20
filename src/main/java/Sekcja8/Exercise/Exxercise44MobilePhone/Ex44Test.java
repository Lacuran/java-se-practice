package Sekcja8.Exercise.Exxercise44MobilePhone;

public class Ex44Test {


    public static void main(String[] args) {
        MobilePhone newMobile = new MobilePhone("123 3441 566");

        newMobile.addNewContact(Contact.createContact("Kamil","2412 124 142"));
        newMobile.addNewContact(Contact.createContact("mlem mlem","22 14 14"));
        newMobile.printContacts();
    }
}
