package common;

public class Client {
    public static void main(String[] args) {
        Current current = new Current();
        WeatherData weatherData = new WeatherData(current);
        weatherData.setData(45);
    }
}
