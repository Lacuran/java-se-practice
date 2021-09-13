package pl.globallogic.qaa_academy.oop;

import java.util.Arrays;

public class Button {
    public int height;
    public int width;
    private String color;
    private String fontType;
    public String text;
    public String animation;
    public boolean isVisible;

    public Button(int height, int width, String text){

        this.height = height;
        this.width = width;
        this.text = text;
    }

    public Button(){
        this(10,15,"Some text");
    }

    public void clickButton(int[] numberOfTimes){
        System.out.println("Origin of array: " + Arrays.toString(numberOfTimes));
        numberOfTimes[1] = 1000;
        System.out.println("Updated array: " + Arrays.toString(numberOfTimes));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getFontType(){
        return fontType;
    }
}
