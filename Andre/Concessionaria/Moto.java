public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, int ano, double preco, int cilindradas) {
        super(modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}
