public class Cliente {

    private String nome;
    private ContaBancaria contato;

    public Cliente(String nome, ContaBancaria contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String obterUsuario() {
        return "Aluno{" +
                "nome='" + this.nome + '\'' +
                ", banco='" + contato.getBanco() + '\'' +
                ", codigo='" + contato.getCodigo() + '\'' +
                '}';
    }
}
