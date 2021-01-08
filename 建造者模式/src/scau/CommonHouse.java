package scau;

public class CommonHouse extends AbstractHouse {
    @Override
    public void bulidWibdow() {
        System.out.println("window");
    }

    @Override
    public void bulidDoor() {
        System.out.println("door");
    }

    @Override
    public void bulidRoof() {
        System.out.println("roof");
    }
}
