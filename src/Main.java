import Sort.*;

public class Main {

    public static void main(String[] args)
    {
        // Declaração das variáveis de resultado (quantidade de comparações ou tempo)
        int comb1, comb2, comb3;
        int bucket1, bucket2, bucket3;
        int gnome1, gnome2, gnome3;
        int cocktail1, cocktail2, cocktail3;
        int selection1, selection2, selection3;

        // Instâncias das classes de ordenação
        BucketSort bucketSort = new BucketSort();
        CombSort combSort = new CombSort();
        GnomeSort gnomeSort = new GnomeSort();
        CocktailSort cocktailSort = new CocktailSort();
        SelectionSort selectionSort = new SelectionSort();

        // Vetores de teste
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int tamanho = 20;

        // Executar os Sort nos trez vetores

        // ---------- Bucket Sort ----------
        bucket1 = bucketSort.sort(vetor1.clone(), tamanho);
        bucket2 = bucketSort.sort(vetor2.clone(), tamanho);
        bucket3 = bucketSort.sort(vetor3.clone(), tamanho);
        // ---------- Comb Sort ----------
        comb1 = combSort.sort(vetor1.clone(), tamanho);
        comb2 = combSort.sort(vetor2.clone(), tamanho);
        comb3 = combSort.sort(vetor3.clone(), tamanho);
        // ---------- Gnome Sort ----------
        gnome1 = gnomeSort.sort(vetor1.clone(), tamanho);
        gnome2 = gnomeSort.sort(vetor2.clone(), tamanho);
        gnome3 = gnomeSort.sort(vetor3.clone(), tamanho);
        // ---------- Cocktail Sort ----------
        cocktail1 = cocktailSort.sort(vetor1.clone(), tamanho);
        cocktail2 = cocktailSort.sort(vetor2.clone(), tamanho);
        cocktail3 = cocktailSort.sort(vetor3.clone(), tamanho);
        // ---------- Selection Sort ----------
        selection1 = selectionSort.sort(vetor1.clone(), tamanho);
        selection2 = selectionSort.sort(vetor2.clone(), tamanho);
        selection3 = selectionSort.sort(vetor3.clone(), tamanho);

        int [] interacoes = new int [3];

        // ------------- Mostra dados ---------------
        System.out.println("=== BUCKET SORT ===");
        interacoes = bucketSort.getInteracao();
        System.out.println("Vetor 1 -> trocas:  " + bucket1 + "| Interações:  " +interacoes[0] );
        System.out.println("Vetor 2 -> trocas:  " + bucket2 + "| Interações:  " +interacoes[1] );
        System.out.println("Vetor 3 -> trocas:  " + bucket3 + "| Interações:  " +interacoes[2]);

        System.out.println("\n=== COMB SORT ===");
        interacoes = combSort.getInteracao();
        System.out.println("Vetor 1 -> trocas:  " + comb1 + "| Interações:  " +interacoes[0] );
        System.out.println("Vetor 2 -> trocas:  " + comb2 + "| Interações:  " +interacoes[1] );
        System.out.println("Vetor 3 -> trocas:  " + comb3 + "| Interações:  " +interacoes[2]);

        System.out.println("\n=== GNOME SORT ===");
        interacoes = gnomeSort.getInteracao();
        System.out.println("Vetor 1 -> trocas:  " + gnome1 + "| Interações:  " +interacoes[0] );
        System.out.println("Vetor 2 -> trocas:  " + gnome2 + "| Interações:  " +interacoes[1] );
        System.out.println("Vetor 3 -> trocas:  " + gnome3 + "| Interações:  " +interacoes[2]);


        System.out.println("\n=== COCKTAIL SORT ===");
        interacoes = cocktailSort.getInteracao();
        System.out.println("Vetor 1 -> trocas:  " + cocktail1 + "| Interações:  " +interacoes[0] );
        System.out.println("Vetor 2 -> trocas:  " + cocktail2 + "| Interações:  " +interacoes[1] );
        System.out.println("Vetor 3 -> trocas:  " + cocktail3 + "| Interações:  " +interacoes[2]);

        System.out.println("\n=== SELECTION SORT ===");
        interacoes = selectionSort.getInteracao();
        System.out.println("Vetor 1 -> trocas:  " + selection1 + "| Interações:  " +interacoes[0] );
        System.out.println("Vetor 2 -> trocas:  " + selection2 + "| Interações:  " +interacoes[1] );
        System.out.println("Vetor 3 -> trocas:  " + selection3 + "| Interações:  " +interacoes[2]);

    }
}
