package geometria;

public class Quadrado extends Retangulo {
    public Quadrado() {
    }

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public Quadrado(double lado, String cor, boolean preenchido) {
        super(lado, lado, cor, preenchido);
    }

    public double getLado() {
        return getBase();
    }

    public void setLado(double lado) {
        setAltura(lado);
        setBase(lado);
    }

    @Override
    public String toString() {
        return "Quadrado [" +
                "lado=" + getBase() +
                ", cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                ']';
    }
}
