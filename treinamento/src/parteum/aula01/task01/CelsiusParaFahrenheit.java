package parteum.aula01.task01;

public class CelsiusParaFahrenheit {
  public static void main(String[] args) {
    final double celsiusTemperature = 20.0;

    double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;

    System.out.println("Temperatura em Celsius: " + celsiusTemperature);
    System.out.println("Temperatura em Fahrenheit: " + fahrenheitTemperature);
  }
}
