package figurasmoveis;

public class PontoMovel implements Movel {
    // atributos
    private int x;
    private int y;
    private int velX;
    private int velY;

    // construtor
    public PontoMovel(int x, int y, int velX, int velY) {
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    // representação da classe em String
    @Override
    public String toString() {
        return "PontoMovel{" +
                "x=" + x +
                ", y=" + y +
                ", velX=" + velX +
                ", velY=" + velY +
                '}';
    }

    // implementação da interface Movel
    @Override
    public void moverParaCima() {
        y += velY;
    }

    @Override
    public void moverParaBaixo() {
        y -= velY;
    }

    @Override
    public void moverParaEsquerda() {
        x -= velX;
    }

    @Override
    public void moverParaDireita() {
        x += velX;
    }
}
