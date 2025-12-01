import java.util.ArrayList;

public class Concessionaria {
    private String nome;
    private ArrayList<Veiculo> estoque;

    public Concessionaria(String nome) {
        this.nome = nome;
        this.estoque = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        this.estoque.add(v);
    }

    public void registrarInteresse(String modeloVeiculo, Cliente cliente) {
        for (Veiculo veiculo : estoque) {
            if (veiculo.getModelo().equalsIgnoreCase(modeloVeiculo)) {
                veiculo.adicionarInteressado(cliente);
                System.out.println("Interesse de " + cliente.getNome() + " registrado em " + veiculo.getModelo());
                return;
            }
        }
        System.out.println("Modelo " + modeloVeiculo + " não encontrado.");
    }

    public void exibirDetalhesVeiculo(String modeloVeiculo) {
        for (Veiculo veiculo : estoque) {
            if(veiculo.getModelo().equalsIgnoreCase(modeloVeiculo)) {
                veiculo.exibirDetalhes();
                veiculo.exibirInteressados();
                return;
            }
        }
        System.out.println("Modelo " + modeloVeiculo + " não encontrado.");
    }
}