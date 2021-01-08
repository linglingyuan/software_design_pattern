package edu;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildDoor() {
        System.out.println("门好");
    }

    @Override
    public void buildWindow() {
        System.out.println("窗户好");
    }
}
