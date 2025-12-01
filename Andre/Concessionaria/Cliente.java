public class Cliente {
    private String nome, telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirContato() {
        System.out.println("Nome: " + this.nome + "\nTelefone: " + this.telefone + "\n");
    }
}