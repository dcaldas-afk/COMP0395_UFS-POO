public class Sorter {
    private int[] data;
    private SortStrategy opcao;

    public Sorter(int[] data) {
        this.data = data;
    }

    public void setStrategy(SortStrategy opcao) {
        this.opcao = opcao;
    }

    public void sort() {
        if (opcao == null) {
            System.out.println("Estratégia inválida");
            return;
        }
        opcao.sort(data);
    }
    
    public void exibirArray() {
        System.out.print("[");
        for (int i : data) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }

    public int[] getData() {
        return data;
    }
}
