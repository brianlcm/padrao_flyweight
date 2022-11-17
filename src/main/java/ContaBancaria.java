public class ContaBancaria {

    private String banco;
    private String codigo;

    public ContaBancaria(String banco, String codigo) {
        this.banco = banco;
        this.codigo = codigo;
    }

    public String getBanco() {
        return banco;
    }

    public String getCodigo() {
        return codigo;
    }
}
