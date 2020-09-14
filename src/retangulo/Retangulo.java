package retangulo;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo() {
        setComprimento(1);
        setLargura(1);
    }

    public Retangulo(double comprimento, double largura) throws IllegalArgumentException {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) throws IllegalArgumentException {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Comprimento deve ser maior do que 0.");
        }
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws IllegalArgumentException {
        if (largura <= 0) {
            throw new IllegalArgumentException("Largura deve ser maior do que 0.");
        }
        this.largura = largura;
    }

    public double perimetro() {
        return 2*comprimento + 2*largura;
    }

    public double area() {
        return comprimento * largura;
    }
}
