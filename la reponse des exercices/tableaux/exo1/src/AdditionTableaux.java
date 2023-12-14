public class AdditionTableaux {
    public static void main(String[] args) {
// Définir les tableaux à additionner
        int[] tableau1 = {1, 2, 3, 4, 5};
        int[] tableau2 = {6, 7, 8, 9, 10};
        int[] tableauResultat = new int[tableau1.length];
        for (int i = 0; i < tableau1.length; i++) {
            tableauResultat[i] = tableau1[i] + tableau2[i];
        }
        System.out.print("Résultat de l'addition : ");
        for (int j : tableauResultat) {
            System.out.print(j + " ");
        }
    }
}