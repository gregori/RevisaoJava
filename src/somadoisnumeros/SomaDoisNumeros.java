package somadoisnumeros;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Por favor insira dois números.");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println(num1 + num2);
        }
    }
}
