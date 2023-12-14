import java.util.Scanner;
public class FactorielleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre pour calculer sa factorielle : ");
        int nombre = scanner.nextInt();
        long factorielle = 1;
        int i = 1;
        do {
            factorielle *= i;
            i++;
        } while (i <= nombre);
        System.out.println("La factorielle de " + nombre + " est : " + factorielle);
    }
}
