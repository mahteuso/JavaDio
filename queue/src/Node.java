public class Node<T> {
    private T value;
    private Node<T> refNext;
    private Node<T> refPrevious;

    public Node(){
        this.refNext = null;
        this.refPrevious = null;
    }

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

    public Node<T> getRefPrevious() {
        return refPrevious;
    }

    public void setRefPrevious(Node<T> refPrevious) {
        this.refPrevious = refPrevious;
    }
}
