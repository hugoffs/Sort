package Sort;

public class GnomeSort extends Sort{
    @Override
    public int sort(int [] vetor , int tamanho)
    {
        System.out.println("Gnome Sorte");
        int troca = 0 ;
        int i = 0;
        while ( i < tamanho) {
            if (i == 0 || vetor[i-1] <= vetor[i]) i++;
            else {
                int tmp = vetor[i];
                vetor[i] = vetor[i-1];
                vetor[--i] = tmp;
                troca ++;
                imprimir(vetor, tamanho);
            }
        }
        return  troca;
    }}
