package pl.globallogic.qaa_academy.oop;

import java.util.List;

public class Ford extends Car{

    public Ford(Engine engine, int numberOfDoors, List<Part> otherParts, GearBox gearBox) {
        super(engine, numberOfDoors, otherParts, gearBox);
    }

    @Override
    public void start() {
        disarmProtectionSystem();
        super.start();
    }

    private void disarmProtectionSystem(){
        System.out.println("Alarm switched off... ");
    }
}
