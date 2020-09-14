package populacaomundial;

public class PopulacaoMundial {
    public static void main(String[] args) {
        long populacaoAtual = 7811874260L;
        final double crescimento = 0.0105;

        int anos = Integer.parseInt(args[0]);

        // pop = juros compostos
        for (int i = 0; i < anos; i++) {
            populacaoAtual += populacaoAtual * crescimento;
        }
        System.out.printf("%,d pessoas\n", populacaoAtual);
    }
}
