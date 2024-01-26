package observer.geeksforgeeks;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);
        weatherStation.removeObserver(currentConditionsDisplay);
        weatherStation.setTemperature(26.0f);
    }
}
