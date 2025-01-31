package com.practice.loosely_coupled.motherboardfactory;

public class AsusMotherboard extends Motherboard {

    public AsusMotherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer, ramSlots, cardSlots, bios);
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }


}
