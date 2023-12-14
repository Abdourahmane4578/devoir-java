public class occurence{
    public static void main(String[] args) {
        int[] tableau = {2, 5, 2, 8, 2, 9, 2, 4, 7};

        int elementRecherche = 2;
        int occurrences = compterOccurrences(tableau, elementRecherche);
        System.out.println("Le nombre d'occurrences de " + elementRecherche + " dans le tableau est : " + occurrences);
    }
    public static int compterOccurrences(int[] tableau, int element) {
        int occurrences = 0;
        for (int j : tableau) {
            if (j == element) {
                occurrences++;
            }
        }
        return occurrences;
    }
}