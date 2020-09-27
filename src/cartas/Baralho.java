package cartas;
/*
 Implemente a classe Baralho para gerenciar um baralho de cartas. Ela deve conter um atributo de instância
 chamado monte que use um tipo que implementa a interface List. A classe Baralho também deve declarar um
 atributo de instância do tipo Integer chamado cartaAtual que representa um número sequencial (0 a 51)
 indicando  a próxima Carta a ser a distribuída a partir do monte, e uma constante com nome TOTAL_DE_CARTAS
 para indicar o número de Cartas total no baralho (52). Deve também implementar uma da constante chamada
 VALORES que contém as Strings de "Ás" a "Rei" e uma da constante NAIPES que contém as Strings
 “Paus”, “Ouros”, “Copas” e “Espadas”.

Implemente o construtor da classe Baralho onde deve ser instanciado o monte com tamanho TOTAL_DE_CARTAS.
O construtor deve usar um loop para preencher o monte com Cartas. Cada Carta é instanciada e inicializada
com duas Strings, uma da constante VALORES (que contém as Strings de "Ás" a "Rei") e uma da constante NAIPES
(que contém as Strings “Paus”, “Ouros”, “Copas” e “Espadas”. Use como referência as informações da wikipedia
para fazer essa implementação:

Implemente na classe Baralho o método embaralhar para embaralhar as Cartas do monte.

Implemente o método distribuir  para distribuir uma Carta do monte. Lembre-se de que cartaAtual
indica o índice da próxima Carta a ser distribuída, isto é, a Carta na parte superior do baralho.
Se monte não estiver vazio este método retorna a Carta na parte superior e incrementa cartaAtual para
preparar-se para a próxima chamada do método distribuir. Caso contrário, deve-se levantar uma exceção
dizendo que não existem mais cartas no baralho.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    // atributos
    private List<Carta> monte;
    private int cartaAtual;

    // constantes
    private final int TOTAL_DE_CARTAS = 52;  // baralho convencional
    private final String[] VALORES = { "Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove",
                                        "Dez", "Valete", "Dama", "Rei"};  // valores possíveis de cartas
    private final String[] NAIPES = { "Paus", "Ouros", "Copas", "Espadas" };

    public Baralho() {
        // inicializar o monte
        monte = new ArrayList<>(TOTAL_DE_CARTAS);
        cartaAtual = 0;

        // inicializar as cartas
        for (String naipe : NAIPES) { // para cada naipe
            for (String valor : VALORES) { // para cada valor
                monte.add(new Carta(naipe, valor)); // cria uma carta: "valor de naipe" e adiciona ao monte
            }
        }
    }

    public void embaralha() {
        Collections.shuffle(monte); // embaralha a lista / monte de cartas
    }

    public Carta distribuir() throws IllegalArgumentException {
        if (monte.size() > 0) { // se não está vazio
            return monte.get(cartaAtual++); // retorna a carta atual e incrementa o índice
        } else {
            throw new IndexOutOfBoundsException("Não existem mais cartas no baralho!");
        }
    }
}
