import java.util.Scanner;
public class MoyenneTroisNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();
        System.out.print("Entrez le troisième nombre : ");
        double nombre3 = scanner.nextDouble();
        double moyenne = (nombre1 + nombre2 + nombre3) / 3;
        System.out.println("La moyenne des trois nombres est : " + moyenne);
        scanner.close();
    }
}