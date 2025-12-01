public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, int ano, double preco, int numeroPortas) {
        super(modelo, ano, preco);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + this.numeroPortas);
    }
}
