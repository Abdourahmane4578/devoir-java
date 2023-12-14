public class PlusGrandeValeur {
    public static void main(String[] args) {
        int[] tableau = {10, 5, 8, 20, 15};
        int plusGrandeValeur = trouverPlusGrandeValeur(tableau);
        System.out.println("La plus grande valeur dans le tableau est : " + plusGrandeValeur);
    }
    public static int trouverPlusGrandeValeur(int[] tableau) {
        if (tableau.length == 0) {
            System.out.println("Le tableau est vide.");
            return Integer.MIN_VALUE; 
        }
        int plusGrandeValeur = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > plusGrandeValeur) {
                plusGrandeValeur = tableau[i];
            }
        }
        return plusGrandeValeur;
    }
}