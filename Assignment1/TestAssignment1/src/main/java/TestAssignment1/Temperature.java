package TestAssignment1;

public class Temperature {

    public static String celcius(int temperature){
        return "The temperature is " + temperature + " celcius";
    }

    public static String fahrenheit(double temperature){
        return "The temperature is " + temperature + " fahrenheit";
    }


    public static double celToFah(double temp){
        return (temp*1.8)+32;
    }

    public static double fahToCel(double temp){
        return (temp-32)/1.8;
    }
}
