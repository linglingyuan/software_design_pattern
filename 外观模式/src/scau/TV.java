package scau;

public class TV {
    private static TV TV = new TV();
    public static TV getInstance(){
        return TV;
    }
    public void on(){
        System.out.println("open");
    }
    public void off(){
        System.out.println("close");
    }
    public void pause(){
        System.out.println("pause");
    }
    public void play(){
        System.out.println("play");
    }
}
