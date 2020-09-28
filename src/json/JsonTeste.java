package json;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import fatura.Fatura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;

public class JsonTeste {
    public static void main(String[] args) {
        // fazendo o parse do arquivo passado na linha de comando
        // o nome do arquivo está em args[0]
        // o FileReader recebe o nome e lê o arquivo
        // o parseReader é um método estático da classe JsonParser
        // que recebe um FileReader e gera um jsonObject
        try {
            JsonObject jsonObject = JsonParser.parseReader(new FileReader(args[0]))
                    .getAsJsonObject();

            JsonArray jsonArray = jsonObject.getAsJsonArray("faturas");

            double total = 0.0;
            // metodo 1 de iteração
            System.out.println("Método 1 de parse");
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject jsonFatura = jsonArray.get(i).getAsJsonObject();
                String codigo = jsonFatura.get("codigo").getAsString();
                String descricao = jsonFatura.get("descricao").getAsString();
                int quantidade = jsonFatura.get("quantidade").getAsInt();
                double preco = jsonFatura.get("preco").getAsDouble();

                Fatura f = new Fatura(codigo, descricao, quantidade, preco);
                System.out.println(f);

                total += f.totalFaturado();
            }

            System.out.printf("Total das faturas: R$ %,.2f (%d faturas)\n",
                                total, jsonArray.size());

            // método 2
            System.out.println("Método 2 de parse");

            // zerar o total das faturas
            total = 0;

            // Gerar um tipo "fatura" para desserialização
            Type faturaType = new TypeToken<Fatura>() {}.getType();

            // considerar que os atributos do json sejam exatamente iguais
            // aos atributos da classe
            Gson gson = new Gson(); // cria um objeto de Gson
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonElement element = jsonArray.get(i); // obter o jsonElement
                Fatura f = gson.fromJson(element, faturaType);
                System.out.println(f);
                total += f.totalFaturado();
            }
            System.out.printf("Total das faturas: R$ %,.2f (%d faturas)\n",
                    total, jsonArray.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
