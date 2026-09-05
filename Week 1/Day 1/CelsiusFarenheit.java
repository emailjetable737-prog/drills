import java.util.Scanner;
import java.lang.Double;

public class CelsiusFarenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Temp in celsius : ");
        double celsius = Double.parseDouble(input.nextLine());

        System.out.print("Temp in farenheit : ");
        double farenheit = Double.parseDouble(input.nextLine());

        System.out.printf("%.2fF is %.2fC\n", farenheit, farenheitToCelsius(farenheit));
        System.out.printf("%.2fC is %.2fF\n", celsius, celsiusToFarenheit(celsius));

        input.close();
    }

    public static double celsiusToFarenheit(double celsius){
        return (celsius * (9.0/5) + 32);
    }

    public static double farenheitToCelsius(double farenheit){
        return (farenheit - 32) * (5.0/9);
    }
}
