package calculadora;

public class Calculadora {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Produto: " + (n1 * n2));
        System.out.println("Diferença: " + (n1 - n2));
        System.out.println("Divisão: " + ((1.0 * n1)/n2));

        if (n1 == n2) {
            System.out.println("Esses números são iguais.");
        } else if (n1 > n2) {
            System.out.println(n1 + " é maior.");
        } else {
            System.out.println(n2 + " é maior.");
        }
    }
}
