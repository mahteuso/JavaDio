public class Queue<T> {
    private Node<T> refFirst;
    private Node<T> refLast;

    public Queue() {
        this.refFirst = null;
        this.refLast = null;
    }

    public boolean isEmpty() {
        if (refFirst == null) {
            return true;
        }
        return false;
    }

    public void dequeue() {

        if (!isEmpty() && !refLast.equals(refFirst)) {
            Node<T> refLocal = refFirst.getRefPrevious();
            refLocal.setRefNext(null);
            refFirst = refLocal;
            refFirst.setRefPrevious(refLocal.getRefPrevious());

        } else {
            refFirst = null;
            refLast = null;
        }

    }

    public void enqueue(Node<T> newNode) {

        if (refFirst == null && refLast == null) {
            refFirst = newNode;
            refFirst.setRefPrevious(refFirst);
            refFirst.setRefNext(null);
        } else if (refLast == null) {
            refLast = newNode;
            refFirst.setRefPrevious(refLast);
            refLast.setRefPrevious(refLast);
            refLast.setRefNext(refFirst);
        } else {
            Node<T> refLocal = refLast;
            refLast = newNode;
            refLocal.setRefPrevious(refLast);
            refLast.setRefNext(refLocal);
            refLast.setRefPrevious(newNode);
        }
    }

    @Override
    public String toString() {
        String returnString = "========== ELements in the Queue ==========\n";
        Node<T> refLocal = refLast;
        returnString += "{value[";
        if (refLocal == null) {
            returnString += " There is no elements in queue]}\n";
            returnString += "==============================================\n";
            return returnString;
        }
        while (refLocal != null) {
            returnString += refLocal.getValue() + " ,";
            refLocal = refLocal.getRefNext();
        }
        returnString += "]}\n";
        returnString += "==============================================\n";
        return returnString;
    }
}
