package edu;

public class CLient {
    public static void main(String[] args) {
        CommonHouse cm = new CommonHouse();
        HouseDirector hd = new HouseDirector(cm);
        House house = hd.constructHouse();
    }
}
