package fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura f = new Fatura(args[0], args[1], Integer.parseInt(args[2]), Double.parseDouble(args[3]));

        System.out.println("Código: " + f.getCodigo());
        System.out.println("Descrição: " + f.getDescricao());
        System.out.println("Quantidade: " + f.getQuantidade());
        System.out.printf("Preço unitário: R$ %.2f\n", f.getPreco());
        System.out.printf("Total: R$ %.2f\n", f.totalFaturado());
    }
}
