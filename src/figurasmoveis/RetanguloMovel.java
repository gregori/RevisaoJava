package figurasmoveis;

public class RetanguloMovel implements Movel {
    // atributos
    private PontoMovel superiorEsquerdo;
    private PontoMovel inferiorDireito;

    // construtor
    public RetanguloMovel(int x1, int y1, int x2, int y2, int velX, int velY) {
        this.superiorEsquerdo = new PontoMovel(x1, y1, velX, velY);
        this.inferiorDireito = new PontoMovel(x2, y2, velX, velY);
    }

    // representação em String da classe
    @Override  // sobrescrita
    public String toString() {
        return "RetanguloMovel{" +
                "superiorEsquerdo=" + superiorEsquerdo +
                ", inferiorDireito=" + inferiorDireito +
                '}';
    }

    // implementação da interface Movel
    @Override
    public void moverParaCima() {
        superiorEsquerdo.moverParaCima();
        inferiorDireito.moverParaCima();
    }

    @Override
    public void moverParaBaixo() {
        superiorEsquerdo.moverParaBaixo();
        inferiorDireito.moverParaBaixo();
    }

    @Override
    public void moverParaEsquerda() {
        superiorEsquerdo.moverParaEsquerda();
        inferiorDireito.moverParaEsquerda();
    }

    @Override
    public void moverParaDireita() {
        superiorEsquerdo.moverParaDireita();
        inferiorDireito.moverParaDireita();
    }
}
