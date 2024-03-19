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


    @Override
    public String toString() {
        Node localRefence = topReference;
        String stringRetorno = "============Total Elements===========\n";
        if (topReference == null){
            stringRetorno += "The stack is Empty\n";
            stringRetorno += "=====================================\n";
            return stringRetorno;
        }


        while (localRefence != null) {
            stringRetorno += "{Node[data=" + localRefence.getValue() + "]}\n";
            localRefence = localRefence.getNodeBellow();
        }
        stringRetorno += "=====================================\n";

        return stringRetorno;
    }
}
