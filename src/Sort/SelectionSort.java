package Sort;

public class SelectionSort extends Sort {
    @Override
    public int sort(int[] vetor, int tamanho) {
        System.out.println("Selection Sort");
        int troca = 0;
        int interacoes = 0;
        int temp;

        for (int i = 0; i < tamanho - 1; i++) {
            int menor_N = i;
            for (int j = i + 1; j < tamanho; j++) {
                interacoes++;
                if (vetor[menor_N] > vetor[j]) {
                    menor_N = j;
                }
            }
            if (menor_N != i) {
                temp = vetor[menor_N];
                vetor[menor_N] = vetor[i];
                vetor[i] = temp;
                troca++;
            }
            imprimir(vetor, tamanho);
        }

        setInteracao(interacoes);
        return troca;
    }
}
