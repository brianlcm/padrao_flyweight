import java.util.ArrayList;
import java.util.List;

public class CatalogoClientes {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrar(String nome, String banco, String codigo) {
        ContaBancaria conta = ContaBancariaFactory.getContaBancaria(banco, codigo);
        Cliente cliente = new Cliente(nome, conta);
        clientes.add(cliente);
    }

    public List<String> obterUsuarios() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterUsuario());
        }
        return saida;
    }
}
