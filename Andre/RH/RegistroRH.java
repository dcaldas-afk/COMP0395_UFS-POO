public class RegistroRH {
    public static void main (String [] args) {
        int proximo = Funcionario.getProximoID();
        System.out.println("\nPróximo ID Disponível: " + proximo);
        System.out.println("(Nenhum funcionário criado ainda)");

        System.out.println("\nCriando funcionários...");
        Funcionario f1 = new Funcionario("Ana Silva");
        System.out.println("Nome:  " + f1.getNome() + " - ID: " + f1.getIdFuncionario());
        Funcionario f2 = new Funcionario("Carlos Santos");
        System.out.println("Nome:  " + f2.getNome() + " - ID: " + f2.getIdFuncionario());
        Funcionario f3 = new Funcionario("Maria Oliveira");
        System.out.println("Nome:  " + f3.getNome() + " - ID: " + f3.getIdFuncionario());
        Funcionario f4 = new Funcionario("Fulano de Tal");
        System.out.println("Nome:  " + f4.getNome() + " - ID: " + f4.getIdFuncionario());

        System.out.println("\nPróximo ID disponível: " + Funcionario.getProximoID());
        int total = Funcionario.getProximoID() - Funcionario.IdInicial;
        System.out.println("Total de funcionários criados: " + total + "\n");
    }
}