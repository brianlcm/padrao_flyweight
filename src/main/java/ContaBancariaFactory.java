import java.util.HashMap;
import java.util.Map;

public class ContaBancariaFactory {

    private static Map<String, ContaBancaria> contas = new HashMap<>();

    public static ContaBancaria getCidade(String banco, String codigo) {
        ContaBancaria conta = contas.get(banco);
        if (conta == null) {
            conta = new ContaBancaria(banco, codigo);
            contas.put(banco, conta);
        }
        return conta;
    }

    public static int getTotalContatos() {
        return contas.size();
    }
}
