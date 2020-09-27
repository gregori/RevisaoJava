package cartas;
/*
Implemente um aplicativo de linha de comando chamado CartasTeste que demonstre o funcionamento da
classe Baralho, embaralhando e distribuindo todas as cartas. Imprima mensagens que indiquem quando o
baralho está sendo embaralhado e uma linha para cada carta distribuída.

$ java CartasTeste

Embaralhando o monte!

Distribuindo Valete de Paus
Distribuindo Ás de Ouros
…
Nenhuma carta no baralho! Fim de jogo!
 */

public class CartasTeste {
    public static void main(String[] args) {
        Baralho b = new Baralho();

        System.out.println("Embaralhando o monte");
        b.embaralha();

        while (true) {
            try {
                System.out.println("Distribuindo " + b.distribuir());
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Nenhuma carta no baralho! Fim de jogo!");
                break;
            }
        }
    }
}
