package observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		HeatIndexDisplay hid = new HeatIndexDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 32.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
	}
}
