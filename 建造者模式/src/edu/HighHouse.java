package edu;

public class HighHouse extends HouseBuilder {
    @Override
    public void buildDoor() {
        System.out.println("豪门好");
    }

    @Override
    public void buildWindow() {
        System.out.println("豪华窗户好");
    }
}
