package scau;

public class Home {
    private DVD dvd;
    private TV tv;

    public Home() {
        this.dvd = DVD.getInstance();
        this.tv = TV.getInstance();
    }
    public void ready(){
        dvd.on();
        tv.on();
    }
    public void play(){
        tv.play();
    }
    public void pause(){
        tv.pause();
    }
    public void off(){
        tv.off();
        dvd.off();
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.ready();
        home.play();
        home.pause();
        home.off();
    }
}
