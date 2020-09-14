package calculapi;

public class CalculaPI {
    public static void main(String[] args) {
        int sinal = 1;
        int valorFinal = Integer.parseInt(args[0]);
        double pi = 0;

        for (int i = 1; i < valorFinal; i += 2) {
            pi += sinal * 1.0 / i;
            sinal *= -1;
        }

        pi = 4 * pi;
        double erro = (1 - (pi / Math.PI)) * 100;
        System.out.println("O valor de pi é " + pi);
        System.out.println("Erro: " + erro + "%");
    }
}
