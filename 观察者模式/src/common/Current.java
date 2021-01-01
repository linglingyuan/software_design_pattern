package common;

public class Current {
    private int temperature;

    public void update(int temperature){
        this.temperature = temperature;
        display();
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void display(){
        System.out.println("+++当前温度" + this.temperature);
    }
}
