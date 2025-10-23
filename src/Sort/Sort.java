package Sort;

public abstract class Sort{
    public void imprimir(int [] vetor, int tamanho)
    {
        for  (int i = 0; i < tamanho; i++)
        {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    public abstract int sort (int [] vetor, int tamanho);
}
