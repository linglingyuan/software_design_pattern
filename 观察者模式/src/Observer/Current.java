package Observer;

public class Current implements Observer1{
    private int temperature;

    @Override
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
