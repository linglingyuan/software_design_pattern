package inversion;

public class ThreeDependence {
    public static void main(String[] args) {
        changhong ch = new changhong();
        OpenAndClose oc = new OpenAndClose(ch);
        oc.open();
    }
}

interface IOOpenAndClose{
    public void open();
}
interface TV{
    public void play();
}
class changhong implements TV{

    @Override
    public void play() {
        System.out.println("长虹电视，打开！");
    }
}
class OpenAndClose implements  IOOpenAndClose{
    private TV tv;

    public OpenAndClose(TV tv){
        this.tv = tv;
    }
    @Override
    public void open() {
        this.tv.play();
    }
}