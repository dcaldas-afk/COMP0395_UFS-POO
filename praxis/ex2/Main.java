public class Main {
    public static void main(String [] args) {
        Pessoa a = new Pessoa();

        a.setIdade(15);
        a.setNome("Fulano");

        System.out.println(a.getNome() + " tem " + a.getIdade() + " anos.");
    }
}