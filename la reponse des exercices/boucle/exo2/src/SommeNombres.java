public class SommeNombres {
    public static void main(String[] args) {
        int somme = 0;
        int i = 1;
        while (i <= 100) {
            somme += i;
            i++;
        }
        System.out.println("La somme des nombres de 1 à 100 est : " + somme);
    }
}