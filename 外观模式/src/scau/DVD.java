package scau;

public class DVD {
    private static DVD dvd = new DVD();
    public static DVD getInstance(){
        return dvd;
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
