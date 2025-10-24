package Sort;

public class GnomeSort extends Sort {
    @Override
    public int sort(int[] vetor, int tamanho) {
        System.out.println("Gnome Sort");
        int troca = 0;
        int interacao = 0;
        int i = 0;

        while (i < tamanho) {
            interacao++;
            if (i == 0 || vetor[i - 1] <= vetor[i]) {
                i++;
            } else {
                // swap
                int tmp = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[--i] = tmp;
                troca++;
                imprimir(vetor, tamanho);
            }
        }

        setInteracao(interacao);
        return troca;
    }
}
