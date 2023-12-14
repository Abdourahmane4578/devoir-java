public class EchangeVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Avant l'échange : a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Après l'échange : a = " + a + ", b = " + b);
    }
}
