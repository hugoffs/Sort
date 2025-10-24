package Sort.Lista.Encadeada;

public class Node
{
    private int dado;
    private Node proximo;

    public Node(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public Node getProximo() {
        return proximo;
    }
    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
