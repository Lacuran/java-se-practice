package pl.globallogic.qaa_academy.oop;

import java.util.Arrays;

public class ButtonApp {

    public static void main(String[] args) {

        Button buttonOne = new Button(1,2,"some text");
        Button buttonTwo = new Button();
        System.out.println(buttonTwo.height + " "
                + buttonTwo.width + " "
                + buttonTwo.text);
        System.out.println(buttonOne.height);
        System.out.println(buttonOne.width);
        System.out.println(buttonOne.text);

        int nums[] = new int[]{1, 2, 3, 4, 5};
        buttonOne.clickButton(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }
}
