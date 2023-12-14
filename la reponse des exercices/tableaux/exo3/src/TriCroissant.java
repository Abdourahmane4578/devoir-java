public class TriCroissant {
    public static void main(String[] args) {
        int[] tableau = {64, 34, 25, 12, 22, 11, 90};
        trierCroissant(tableau);
        System.out.print("Tableau trié par ordre croissant : ");
        for (int j : tableau) {
            System.out.print(j + " ");
        }
    }
    public static void trierCroissant(int[] tableau) {
        int n = tableau.length;
        boolean estEchange;
        do {
            estEchange = false;
            for (int i = 0; i < n - 1; i++) {
                if (tableau[i] > tableau[i + 1]) {

                    int temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    estEchange = true;
                }
            }
            n--;
        } while (estEchange);
    }
}