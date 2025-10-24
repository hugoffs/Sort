package Sort;

public class BibleSort extends Sort
{
    @Override
    public int sort(int [] vertor, int tamnho )
    {
        System.out.println("Bible Sorte");
        int interacao = 0;
        int temp;
        int colisao;
        int troca = 0;
        for( int i = 0 ; i < tamnho; i++)
        {
            colisao = 0;
            for (int j =1 ; j< tamnho-1; j++)
            {
                interacao ++;
                if (vertor[j-1] > vertor[j])
                {
                    temp = vertor[j-1];
                    vertor[j-1] = vertor[j];
                    vertor[j] = temp;
                    troca ++;
                    colisao ++ ;
                    imprimir(vertor,tamnho);
                }
            }
            if (colisao > 0) colisao = 0;
            else break;
        }

        setInteracao(interacao);
        return troca;
    }
}
