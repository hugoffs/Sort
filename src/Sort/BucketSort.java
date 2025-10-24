package Sort;
import Sort.Lista.Encadeada.Node;

public class BucketSort extends Sort {
    private final int M = 10; // número de baldes
    private Node last; // referência ao último nó processado

    @Override
    public int sort(int[] vetor, int tamanho) {
        System.out.print("Bucket Sort ");
        if (tamanho <= 0) return 0;

        int max = vetor[0], min = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > max) max = vetor[i];
            if (vetor[i] < min) min = vetor[i];
        }

        // cria lista encadeada com os elementos do vetor
        Node lista = null;
        for (int i = tamanho - 1; i >= 0; i--) {
            Node novo = new Node(vetor[i]);
            novo.setProximo(lista);
            lista = novo;
        }

        lista = bucketSort(lista, min, max);

        // copiar de volta para o vetor e contar trocas
        int indice = 0, trocas = 0;
        for (Node p = lista; p != null; p = p.getProximo()) {
            vetor[indice++] = p.getDado();
            trocas++;
            imprimir(vetor, tamanho);
        }

        return trocas;
    }

    private Node bucketSort(Node s, int min, int max) {
        if (s == null) return s;
        if (max == min) {
            last = s;
            while (last.getProximo() != null) last = last.getProximo();
            return s;
        }

        int div = (max - min) / M;
        if (div == 0) div = 1;

        Node[] head = new Node[M];
        int[] minb = new int[M];
        int[] maxb = new int[M];

        for (int i = 0; i < M; i++) head[i] = null;

        // distribuir os elementos nos baldes
        while (s != null) {
            int i = (s.getDado() - min) / div;
            if (i < 0) i = 0;
            else if (i >= M) i = M - 1;

            Node t = s;
            s = s.getProximo();
            t.setProximo(head[i]);
            head[i] = t;

            if (head[i].getProximo() == null) {
                minb[i] = maxb[i] = t.getDado();
            } else {
                if (t.getDado() > maxb[i]) maxb[i] = t.getDado();
                if (t.getDado() < minb[i]) minb[i] = t.getDado();
            }
        }

        Node aux = new Node(0);
        Node temp = aux;

        for (int i = 0; i < M; i++) {
            if (head[i] != null) {

                temp.setProximo(bucketSort(head[i], minb[i], maxb[i]));
                temp = last;
            }
        }

        return aux.getProximo();
    }
}
