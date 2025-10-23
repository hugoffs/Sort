import Sort.*;

public class Main {

    public static void main(String[] args)
    {
        BucketSort bucketSort = new BucketSort();
        CombSort combSort = new CombSort();
        GnomeSort gnomeSort = new GnomeSort();
        CocktailSort cocktailSort = new CocktailSort();
        SelcetionSort selcetionSort = new SelcetionSort();

        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int tamanho = 20;


        int teste = selcetionSort.sort(vetor1,tamanho );
        System.out.println(teste);
        teste = selcetionSort.sort(vetor2,tamanho);
        System.out.println(teste);
        teste = selcetionSort.sort(vetor3,tamanho);
        System.out.println(teste);

    }
}
