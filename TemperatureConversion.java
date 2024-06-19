import java.util.Scanner;


public class TemperatureConversion{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Tempeture in celsius");
        double temp=sc.nextDouble();
        convertTemperatureUnit(temp);
        
    }

    public static void convertTemperatureUnit(double t1){
        System.out.println("Temerature in celsius : "+t1+" °C");
        System.out.println("Temperature in Fahrenheit : "+((t1*9/5)+32)+" °F");
        System.out.println("Temperature in Kelvin : "+ (t1+ 273.15)+" K");

    }

}
