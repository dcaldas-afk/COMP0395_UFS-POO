public class Main {
    public static void main(String[] args) {
        Carro civic = new Carro("Civic", 2023, 160000.00, 4);
        Carro corolla = new Carro("Corolla", 2024, 175000.00, 4);
        Moto cg160 = new Moto("CG 160 Fan", 2023, 15000.00, 160);
        Moto biz = new Moto("Biz 125", 2024, 14000.00, 125);

        Cliente joao = new Cliente("João Silva", "79999887766");
        Cliente maria = new Cliente("Maria Souza", "79988776655");
        Cliente pedro = new Cliente("Pedro Almeida", "79999554433");

        Concessionaria minhaConcessionaria = new Concessionaria("Maracar Veículos");
        System.out.println("--- Adicionando Veículos ao Estoque ---\n");
        minhaConcessionaria.adicionarVeiculo(civic);
        minhaConcessionaria.adicionarVeiculo(corolla);
        minhaConcessionaria.adicionarVeiculo(cg160);
        minhaConcessionaria.adicionarVeiculo(biz);

        System.out.println("\n--- Registrando Interesse dos Clientes ---\n");
        minhaConcessionaria.registrarInteresse("Civic", joao);
        minhaConcessionaria.registrarInteresse("Civic", maria);
        minhaConcessionaria.registrarInteresse("Corolla", maria);
        minhaConcessionaria.registrarInteresse("Biz 125", pedro);
        minhaConcessionaria.registrarInteresse("CG 160 Fan", joao);
        minhaConcessionaria.registrarInteresse("Fusca", pedro);

        System.out.println("\n--- Detalhes do Veículo Específico ---\n");
        minhaConcessionaria.exibirDetalhesVeiculo("Civic");

        System.out.println("\n--------------------------------------\n");
        minhaConcessionaria.exibirDetalhesVeiculo("Biz 125");
    }
}
