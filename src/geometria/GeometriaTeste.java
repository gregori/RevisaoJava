package geometria;

public class GeometriaTeste {
    public static void main(String[] args) {
        double raio = Double.parseDouble(args[0]);
        double base = Double.parseDouble(args[1]);
        double altura = Double.parseDouble(args[2]);
        double lado = Double.parseDouble(args[3]);

        Circulo c = new Circulo(raio);
        Retangulo r = new Retangulo(base, altura);
        Quadrado q = new Quadrado(lado);

        System.out.println("Área do círculo: " + c.getArea());
        System.out.println("Circunferência do círculo: " + c.getPerimetro());
        System.out.println("Área do retângulo: " + r.getArea());
        System.out.println("Perímetro do retângulo: " + r.getPerimetro());
        System.out.println("Área do quadrado: " + q.getArea());
        System.out.println("Perímetro do quadrado: " + q.getPerimetro());
    }
}
