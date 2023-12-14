import java.util.Scanner;
public class CalculateurFraisExpedition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le poids du colis en kilogrammes : ");
        double poidsColis = scanner.nextDouble();
        double fraisExpedition;
        if (poidsColis <= 1.0) {
            fraisExpedition = 5.0;
        } else if (poidsColis <= 5.0) {
            fraisExpedition = 8.0;
        } else if (poidsColis <= 10.0) {
            fraisExpedition = 12.0;
        } else {
            fraisExpedition = 15.0;
        }
        System.out.println("Les frais d'expédition pour un colis de " + poidsColis +
                " kg sont de " + fraisExpedition + " euros.");
        scanner.close();
    }
}
