package Sekcja9.Lesson.Lesson123;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Power Up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("Now Ringing " + phoneNumber + " on mobile phone");
        } else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Ring ring... Melody");
        } else {
            System.out.println("Mobile phone not On");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
