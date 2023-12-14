import java.util.Scanner;
public class ConvertisseurTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez le type de conversion :");
        System.out.println("1. Celsius vers Fahrenheit");
        System.out.println("2. Fahrenheit vers Celsius");
        int choix = scanner.nextInt();
        double temperature;
        if (choix == 1) {
            System.out.print("Entrez la température en degrés Celsius : ");
            temperature = scanner.nextDouble();
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println(temperature + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");
        } else if (choix == 2) {
            System.out.print("Entrez la température en degrés Fahrenheit : ");
            temperature = scanner.nextDouble();
            double celsius = (temperature - 32) * 5/9;
            System.out.println(temperature + " degres Fahrenheit équivalent à " + celsius + " degrés Celsius.");
        } else {
            System.out.println("Choix invalide.");
        }
        scanner.close();
    }
}
