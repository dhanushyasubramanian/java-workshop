package src.com.java.workshop.temperaturedata.beans;

public class TemperatureSensor implements Sensor {
    private float temperature;
    public Temperature (float aTemperature){
        temperature=aTemperature;
    }
    @Override
    public float getreading(){
        return temperature;
    }
}

