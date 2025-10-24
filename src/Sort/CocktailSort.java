package Sort;

public class CocktailSort  extends Sort
{

    @Override
    public int sort(int [] vetor, int tamanho)
    {
        int interacao = 0;
        System.out.println("Coocktail Sort");
        int inicio = 0;
        int fim = tamanho -1 ;
        boolean bobora = true;
        int temp;
        int troca  = 0;

        while (bobora){
            bobora = false;
            for (int i = 0; i < fim; i++){
                interacao ++;
                if (vetor[i] > vetor[i + 1] ){
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    bobora = true;
                    troca ++;
                    imprimir(vetor,tamanho);
                }

            }
            if (!bobora){break;}
            bobora = false;

            for (int i = fim; i > inicio; i--)
            {
                interacao ++;
                if (vetor[i] < vetor[i - 1]){
                    temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1 ] = temp;
                    bobora = true;
                    troca ++;
                    imprimir(vetor,tamanho);
                }
            }
        }
        setInteracao(interacao);
        return troca;
    }
}
