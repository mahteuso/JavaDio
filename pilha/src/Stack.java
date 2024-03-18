public class Stack<T> {
    private Node<T> topReference;

    public Stack(){
        this.topReference = null;
    }

    public boolean isEmpty(){
        return topReference == null ? true : false;
    }

    public Node<T> top(){
        return topReference;
    }

    public void push(Node newElement){
        Node reference = topReference;
        topReference = newElement;
        newElement.setNodeBellow(reference);
    }

    public void pop(){
        if (topReference != null){
            topReference = topReference.getNodeBellow();
            topReference.setNodeBellow(topReference.getNodeBellow());
        } else {
            System.out.println("The stack is Empty");
        }

    }

    public void getAll(){
        Node localRefence =  topReference;
        while (localRefence != null){
            System.out.println(localRefence.getValue());
             localRefence= localRefence.getNodeBellow();
        }
    }


}
