package Sort;

public class CombSort extends Sort {
    @Override
    public int sort(int[] vetor, int tamanho) {
        System.out.println("Comb Sort");
        boolean trocou = true;
        int trocas = 0;
        int interacoes = 0;
        float fatorReducao = 1.3f;
        int gap = tamanho;

        while (gap > 1 || trocou) {
            gap = (int)(gap / fatorReducao);
            if (gap < 1) gap = 1;

            trocou = false;

            for (int i = 0; i + gap < tamanho; i++) {
                interacoes++;
                if (vetor[i] > vetor[i + gap]) {
                    combSort(vetor, i, i + gap);
                    trocou = true;
                    trocas++;
                    imprimir(vetor, tamanho);
                }
            }
        }

        setInteracao(interacoes);
        return trocas;
    }

    private void combSort(int[] vetor, int x, int y) {
        int temp = vetor[x];
        vetor[x] = vetor[y];
        vetor[y] = temp;
    }
}
