package Observer;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Current current = new Current();
        Current current1 = new Current();
        List<Observer1> observer1List = new ArrayList<>();
        WeatherData weatherData = new WeatherData(observer1List);
        weatherData.registerObserver(current);
        weatherData.registerObserver(current1);
        weatherData.setData(28);
    }
}
