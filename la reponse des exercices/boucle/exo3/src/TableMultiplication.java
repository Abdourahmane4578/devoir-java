import java.util.Scanner;
public class TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        int nombre = scanner.nextInt();
        System.out.println("Table de multiplication de " + nombre + " :");
        for (int i = 1; i <= 10; i++) {
            int resultat = nombre * i;
            System.out.println(nombre + " * " + i + " = " + resultat);
        }
        scanner.close();
    }
}