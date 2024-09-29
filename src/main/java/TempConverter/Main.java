package TempConverter;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("Fahrenheit to Celsius:");

        System.out.printf("32F = %.2fC\n", converter.fahrenheitToCelsius(32));
        System.out.printf("212F = %.2fC\n", converter.fahrenheitToCelsius(212));
        System.out.printf("-40F = %.2fC\n", converter.fahrenheitToCelsius(-40));

        System.out.println("\nCelsius to Fahrenheit:");
        System.out.printf("0C = %.2fF\n", converter.celsiusToFahrenheit(0));
        System.out.printf("100C = %.2fF\n", converter.celsiusToFahrenheit(100));
        System.out.printf("-40C = %.2fF\n", converter.celsiusToFahrenheit(-40));

        System.out.println("\nKelvin to Celsius:");
        System.out.printf("273.15K = %.2fC\n", TemperatureConverter.kelvinToCel((float)273.15));

        System.out.println("\nKelvin to Fahrenheit:");
        System.out.printf("273.15K = %.2fF\n", TemperatureConverter.kelvinToFah(273.15));

        System.out.println("\nIs extreme temperature:");
        System.out.println("-50C: " + converter.isExtremeTemperature(-50));
        System.out.println("20C: " + converter.isExtremeTemperature(20));
        System.out.println("60C: " + converter.isExtremeTemperature(60));

    }
}
