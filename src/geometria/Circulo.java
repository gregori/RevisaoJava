package geometria;

public class Circulo extends Forma {
    protected double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo [" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                ']';
    }
}
