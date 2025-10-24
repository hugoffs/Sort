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

        // ------------- Mostra dados ---------------
        System.out.println("=== BUCKET SORT ===");
        System.out.println("Vetor 1 -> " + bucket1);
        System.out.println("Vetor 2 -> " + bucket2);
        System.out.println("Vetor 3 -> " + bucket3);

        System.out.println("\n=== COMB SORT ===");
        System.out.println("Vetor 1 -> " + comb1);
        System.out.println("Vetor 2 -> " + comb2);
        System.out.println("Vetor 3 -> " + comb3);

        System.out.println("\n=== GNOME SORT ===");
        System.out.println("Vetor 1 -> " + gnome1);
        System.out.println("Vetor 2 -> " + gnome2);
        System.out.println("Vetor 3 -> " + gnome3);

        System.out.println("\n=== COCKTAIL SORT ===");
        System.out.println("Vetor 1 -> " + cocktail1);
        System.out.println("Vetor 2 -> " + cocktail2);
        System.out.println("Vetor 3 -> " + cocktail3);

        System.out.println("\n=== SELECTION SORT ===");
        System.out.println("Vetor 1 -> " + selection1);
        System.out.println("Vetor 2 -> " + selection2);
        System.out.println("Vetor 3 -> " + selection3);
    }
}
