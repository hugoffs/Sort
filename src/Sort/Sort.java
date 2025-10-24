package Sort;

public abstract class Sort
{
    private  int [] interacoes = new int[3];
    private int n_interacoes = 0;

    public void imprimir(int [] vetor, int tamanho)
    {
        for  (int i = 0; i < tamanho; i++)
        {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    public abstract int sort (int [] vetor, int tamanho);

    public void setInteracao(int dado)
    {
        interacoes[n_interacoes] = dado;
        n_interacoes++;
    }
    public int[] getInteracao(){ return interacoes;}
}
