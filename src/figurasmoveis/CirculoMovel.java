package figurasmoveis;

public class CirculoMovel implements Movel {
    // atributos
    private int raio;
    private PontoMovel centro;

    // construtor
    public CirculoMovel(int x, int y, int velX, int velY, int raio) {
        this.raio = raio;
        this.centro = new PontoMovel(x, y, velX, velY);
    }

    // representação em String da classe
    @Override
    public String toString() {
        return "CirculoMovel{" +
                "raio=" + raio +
                ", centro=" + centro +
                '}';
    }

    // implementação da interface Movel
    @Override
    public void moverParaCima() {
        centro.moverParaCima();
    }

    @Override
    public void moverParaBaixo() {
        centro.moverParaBaixo();
    }

    @Override
    public void moverParaEsquerda() {
        centro.moverParaEsquerda();
    }

    @Override
    public void moverParaDireita() {
        centro.moverParaDireita();
    }
}
