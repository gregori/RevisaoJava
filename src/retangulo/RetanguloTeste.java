package retangulo;

public class RetanguloTeste {
    public static void main(String[] args) {
        Retangulo r;
        try {
            if (args.length == 2) {
                double comprimento = Double.parseDouble(args[0]);
                double largura = Double.parseDouble(args[1]);

                r = new Retangulo(comprimento, largura);
            } else {
                r = new Retangulo();
            }
            System.out.println("Área: " + r.area());
            System.out.println("Perímetro: " + r.perimetro());
        } catch (IllegalArgumentException ex) {
            System.err.println("Erro: Um dos lados do retângulo é igual ou menor do que zero.");
        }
    }
}
