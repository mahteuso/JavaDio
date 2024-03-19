public class Node<T> {
    private T value;
    private Node<T> refNext;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getRefNext() {
        return refNext;
    }

    public void setRefNext(Node<T> refNext) {
        this.refNext = refNext;
    }
}
