import java.util.Scanner;
public class PlusGrandParmiTrois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();
        System.out.print("Entrez le troisième nombre : ");
        double nombre3 = scanner.nextDouble();
        double plusGrand = nombre1;
        if (nombre2 > plusGrand) {
            plusGrand = nombre2;
        }
        if (nombre3 > plusGrand) {
            plusGrand = nombre3;
        }
        System.out.println("Le plus grand nombre est : " + plusGrand);
        scanner.close();
    }
}