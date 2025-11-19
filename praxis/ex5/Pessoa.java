public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private String cabelo;
    private Strinc cor;


    // construtores
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(Double altura, String cabelo, String cor) {
        this.altura = altura;
        this.cabelo = cabelo;
        this.cor = cor;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getCabelo() {
        return cabelo;
    }

    public String getCor() {
        return cor;
    }
    //////////
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.getNome() + ", tenho " + this.getIdade() + " anos e " + this.getAltura() + " metros de altura.");
        System.out.println("Eu sou " + this.getCor() + " e meu cabelo é " + this.getCabelo());
    }
}