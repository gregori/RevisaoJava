package cartas;

/*
4. [Cartas] Implemente um aplicativo para jogar cartas.

Implemente a classe Carta contendo dois atributos de instância do tipo String naipe e valor que serão utilizadas
para armazenar o nome do valor e o nome do naipe de uma carta específica. O construtor da classe deve receber
duas Strings que ele vai utiizar para inicializar naipe e valor. Implemente um método chamado toString que
retorna uma String com formato "Rainha de Copas".

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

https://pt.wikipedia.org/wiki/Baralho#Baralho_francês_de_52_cartas

Implemente na classe Baralho o método embaralhar para embaralhar as Cartas do monte.

Implemente o método distribuir  para distribuir uma Carta do monte. Lembre-se de que cartaAtual
indica o índice da próxima Carta a ser distribuída, isto é, a Carta na parte superior do baralho.
Se monte não estiver vazio este método retorna a Carta na parte superior e incrementa cartaAtual para
preparar-se para a próxima chamada do método distribuir. Caso contrário, deve-se levantar uma exceção
dizendo que não existem mais cartas no baralho.

Implemente um aplicativo de linha de comando chamado CartasTeste que demonstre o funcionamento da classe
Baralho, embaralhando e distribuindo todas as cartas. Imprima mensagens que indiquem quando o baralho está
sendo embaralhado e uma linha para cada carta distribuída.

$ java CartasTeste

Embaralhando o monte!

Distribuindo Valete de Paus
Distribuindo Ás de Ouros
…
Nenhuma carta no baralho! Fim de jogo!
 */
public class Carta {
    // atributos
    private String naipe;
    private String valor;

    // construtor
    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    // representação em String da classe
    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
