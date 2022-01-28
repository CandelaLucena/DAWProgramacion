public class Heater {
    private double temperature;
    private double max;
    private double min;
    private double increment;

    public Heater(double aMax, double aMin){
        temperature = 15.0;
        increment = 5.0;
        max = aMax;
        min = aMin;
    }

    public void warmer(){
        if(temperature + increment > max){

        }else{
            temperature = temperature + increment;
        }
    }

    public void cooler(){
        if(temperature - increment < min){

        }else{
            temperature = temperature - increment;
        }
    }

    public double getTemperature(){
        return temperature;
    }

    public void setIncrement(double inc){
        if(inc >= 1.0 && inc <= 5.0){
            increment = inc;
        }else{

        }
    }
}
