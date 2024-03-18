public class Node<T> {
    private T value;
    private Node<T> nodeBellow;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNodeBellow() {
        return nodeBellow;
    }

    public void setNodeBellow(Node<T> nodeBellow) {
        this.nodeBellow = nodeBellow;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
