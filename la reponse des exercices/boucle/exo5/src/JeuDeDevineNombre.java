import java.util.Scanner;
public class JeuDeDevineNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreSecret = 42;
        int tentative;
        System.out.println("Bienvenue dans le jeu de deviner le nombre!");
        do {
            System.out.print("Devinez le nombre : ");
            tentative = scanner.nextInt();
            if (tentative < nombreSecret) {
                System.out.println("Le nombre est plus grand. Essayez à nouveau.");
            } else if (tentative > nombreSecret) {
                System.out.println("Le nombre est plus petit. Essayez à nouveau.");
            } else {
                System.out.println("Félicitations! Vous avez deviné le bon nombre.");
            }
        } while (tentative != nombreSecret);
        scanner.close();
    }
}