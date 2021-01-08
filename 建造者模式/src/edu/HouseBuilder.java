package edu;

//抽象的建造者
public abstract class HouseBuilder {
    protected House house;
    //将建造流程写好
    public abstract void buildDoor();
    public abstract void buildWindow();
    //将建造好的房子返回
    public House buildHouse(){
        return house;
    }
}
