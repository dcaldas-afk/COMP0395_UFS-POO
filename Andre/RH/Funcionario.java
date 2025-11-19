public class Funcionario {
    public  static final int IdInicial = 1000;
    private static int proximoID = IdInicial;
    private int idFuncionario;
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
        this.idFuncionario = proximoID;
        proximoID++;
    }
    public static int getProximoID() {
        return proximoID;
    }
    public String getNome() {
        return nome;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }
}