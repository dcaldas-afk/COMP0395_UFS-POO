import java.util.ArrayList;

public class Veiculo {
    protected String modelo;
    protected double preco;
    protected int ano;
    protected ArrayList<Cliente> clientesInteressados;

    public Veiculo(String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.clientesInteressados = new ArrayList<>();
    }

    public void adicionarInteressado(Cliente cliente) {
        this.clientesInteressados.add(cliente);
    }

    public String getModelo() {
        return modelo;
    }
    
    public void exibirDetalhes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
    }

    public void exibirInteressados() {
        if (!clientesInteressados.isEmpty()) {
            System.out.println("Total de Interessados: " + this.clientesInteressados.size());
            System.out.println("\nClientes Interessados: \n");
            for (Cliente cliente : clientesInteressados) {
                cliente.exibirContato();
            }
        }
    }
}