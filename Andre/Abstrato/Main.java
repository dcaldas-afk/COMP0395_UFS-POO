public class Main {
    public static void main(String[] args) {

        int[] vetorOriginal = {5, 2, 9, 1, 3};

        Sorter sorter = new Sorter(vetorOriginal.clone());

        System.out.print("Usando Insertion Sort: ");
        sorter.setStrategy(new InsertionSortStrategy());
        sorter.sort();
        sorter.exibirArray();

        sorter = new Sorter(vetorOriginal.clone());
        System.out.print("Usando Selection Sort: ");
        sorter.setStrategy(new SelectionSortStrategy());
        sorter.sort();
        sorter.exibirArray();
    }
}
