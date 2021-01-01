package common;

public class WeatherData {
    private int temperature;
    private Current current;
    //加入第三方时，声明一个变量
    public WeatherData(Current current) {
        this.current = current;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void dataChage(){
        current.update(getTemperature());
        //这里也要修改
    }
    public void setData(int temperature){
        this.temperature = temperature;
        dataChage();
    }
}
