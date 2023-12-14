public class FusionTableauxTries {
    public static void main(String[] args) {

        int[] tableau1 = {1, 3, 5, 7, 9};
        int[] tableau2 = {2, 4, 6, 8, 10};

        int[] tableauFusionne = fusionnerTableauxTries(tableau1, tableau2);
// Afficher le tableau fusion
        System.out.print("Tableau fusionné trié : ");
        for (int j : tableauFusionne) {
            System.out.print(j + " ");
        }
    }
    // Méthode pour fusionner deux tableaux triés en un seul tableau trié
    public static int[] fusionnerTableauxTries(int[] tableau1, int[] tableau2) {
        int taille1 = tableau1.length;
        int taille2 = tableau2.length;
        int[] tableauFusionne = new int[taille1 + taille2];
        int i = 0, j = 0, k = 0;
// Fusionner les tableaux tant que l'un d'entre eux n'est pas entièrement parcouru
        while (i < taille1 && j < taille2) {
            if (tableau1[i] < tableau2[j]) {
                tableauFusionne[k] = tableau1[i];
                i++;
            } else {
                tableauFusionne[k] = tableau2[j];
                j++;
            }
            k++;
        }
// Copier les éléments restants du premier tableau, s'il y en a
        while (i < taille1) {
            tableauFusionne[k] = tableau1[i];
            i++;
            k++;
        }
// Copier les éléments restants du deuxième tableau, s'il y en a
        while (j < taille2) {
            tableauFusionne[k] = tableau2[j];
            j++;
            k++;
        }
        return tableauFusionne;
    }
}
