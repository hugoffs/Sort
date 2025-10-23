package Sort;

public class SelcetionSort extends Sort
{
    @Override
    public int sort(int [] vertor, int tamanho)
    {
        System.out.println("Selcetion Sort");
        int troca = 0;
        int temp;
        for (int i = 0 ; i < tamanho; i++){
            int menor_N = i;
            for(int j = 0 ; j < tamanho; j++){
                if (vertor[menor_N] > vertor[j]){
                    menor_N = j;
                }
            }
            if( menor_N != i ){
                temp = vertor[menor_N];
                vertor[menor_N] = vertor[i];
                vertor[i] = temp;
                troca ++;
            }
            imprimir(vertor,tamanho);
        }

        return  troca;
    }
}
