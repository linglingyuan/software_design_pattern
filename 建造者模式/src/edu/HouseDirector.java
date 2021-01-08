package edu;

public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //如何处理构建房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildDoor();
        houseBuilder.buildWindow();
        return houseBuilder.buildHouse();
    }
}
