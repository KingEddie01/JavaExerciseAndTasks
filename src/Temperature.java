import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        System.out.println(toKelvin(20));
        System.out.println(toCelsius(293.15));

    }

    public static double toKelvin(double Celsius){
        return (Celsius + 273.15);
    }
     public static  double toCelsius(double Kelvin){
        return (Kelvin - 237.15);
     }

}
