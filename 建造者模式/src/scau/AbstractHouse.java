package scau;

public abstract class AbstractHouse {
    public abstract void bulidWibdow();
    public abstract void bulidDoor();
    public abstract void bulidRoof();
    public  void bulid(){
        bulidDoor();
        bulidRoof();
        bulidWibdow();
    };
}
