package figurasmoveis;

public class FigurasMoveisTeste {
    public static void main(String[] args) { // args c 3 5 2 1 1
        String figura = args[0]; // c ou r

        if (figura.equals("r")) {
            int x1 = Integer.parseInt(args[1]);
            int y1 = Integer.parseInt(args[2]);
            int x2 = Integer.parseInt(args[3]);
            int y2 = Integer.parseInt(args[4]);
            int velX = Integer.parseInt(args[5]);
            int velY = Integer.parseInt(args[6]);

            RetanguloMovel r = new RetanguloMovel(x1, y1, x2, y2, velX, velY);
            testaFiguraMovel(r);
        } else if (figura.equals("c")) {
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);
            int velX = Integer.parseInt(args[3]);
            int velY = Integer.parseInt(args[4]);
            int raio = Integer.parseInt(args[5]);

            CirculoMovel c = new CirculoMovel(x, y, velX, velY, raio);
            testaFiguraMovel(c);
        }
    }

    private static void testaFiguraMovel(Movel m) {
        System.out.println(m);
        System.out.println("Mover para cima");
        m.moverParaCima();
        System.out.println(m);
        System.out.println("Mover para baixo");
        m.moverParaBaixo();
        System.out.println(m);
        System.out.println("Mover para esquerda");
        m.moverParaEsquerda();
        System.out.println(m);
        System.out.println("Mover para direita");
        m.moverParaDireita();
        System.out.println(m);
    }
}
