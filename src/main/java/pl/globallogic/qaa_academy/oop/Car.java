package pl.globallogic.qaa_academy.oop;

import java.util.List;

public class Car {

    private Engine engine;
    private int numberOfDoors;
    private List<Part> otherParts;
    private GearBox gearBox;



    public Car(Engine engine,int numberOfDoors, List<Part> otherParts, GearBox gearBox){
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
        this.otherParts = otherParts;
        this.gearBox = gearBox;
    }

    public void start(){
        engine.ignite();
    }
}
