package Observer;

import java.util.List;

public class WeatherData implements Subject{
    public int temperature;
    private List<Observer1> observerList;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public WeatherData(List<Observer1> observerList) {
        this.observerList = observerList;
    }

    public void dataChage(){
        notifyObserver();
    }
    public void setData(int temperature){
        this.temperature = temperature;
        dataChage();
    }
    @Override
    public void registerObserver(Observer1 observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer1 observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < this.observerList.size(); i++){
            observerList.get(i).update(temperature);
        }
    }
}
