public class Stack<T> {
    private Node<T> topReference;

    public Stack() {
        this.topReference = null;
    }

    public boolean isEmpty() {
        return topReference == null ? true : false;
    }

    public Node<T> top() {
        return topReference;
    }

    public void push(Node newElement) {
        Node reference = topReference;
        topReference = newElement;
        newElement.setNodeBellow(reference);
    }

    public void pop() {

        if (!this.isEmpty()) {
            if (topReference.getNodeBellow() != null) {
                topReference = topReference.getNodeBellow();
                topReference.setNodeBellow(topReference.getNodeBellow());
            } else {
                topReference = null;
            }
        } else {
            System.out.println("The stack is Empty");
        }

    }

    public void getAll() {
        Node localRefence = topReference;
        System.out.println("======Total Elements======");
        while (localRefence != null) {
            System.out.println(localRefence.getValue());
            localRefence = localRefence.getNodeBellow();
        }
    }


}
