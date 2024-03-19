public class LinkedList<T> {
    private Node<T> refLast;

    public LinkedList() {
        this.refLast = null;
    }

    public boolean isEmpty() {
        return refLast == null ? true : false;
    }

    public int getSize() {
        Node<T> refLocal = refLast;
        int total = 0;
        while (refLocal != null) {
            refLocal = refLocal.getRefNext();
            total++;
        }
        return total;
    }

    public void add(Node<T> newNode) {

        if (isEmpty()) {
            refLast = newNode;
            refLast.setValue(newNode.getValue());
        } else {
            if (!refLast.equals(newNode)) {
                Node<T> refLocal = refLast;
                refLast = newNode;
                refLast.setValue(newNode.getValue());
                refLast.setRefNext(refLocal);
            } else {
                System.out.println("");
                System.out.println("---------------------------------------------------------");
                System.out.println("This element wasn't add because yet exists in the list");
                System.out.println("---------------------------------------------------------");
                System.out.println("");
            }

        }
    }

    public boolean isNext() {
        Node<T> refLocal = refLast;
        while (refLocal != null) {
            refLocal = refLocal.getRefNext();
            return true;
        }
        return false;
    }

    public T getNode(T value) {
        Node<T> refLocal = refLast;
        while (isNext()) {
            if (refLocal.getValue() == value) {
                return refLocal.getValue();
            }
            refLocal = refLocal.getRefNext();
        }

        return null;
    }

    public void remove(T value) {
        Node<T> refLocal = refLast;
        Node<T> refPrevious = refLocal;
        while (isNext()) {
            if (refLocal.getValue() == value && refLocal.equals(refLast)) {
                refLast = refLocal.getRefNext();
                break;

            } else if (refLocal.getValue() == value && refLocal.getRefNext() == null) {

                refPrevious.setRefNext(null);

                break;

            } else if (refLocal.getValue() == value) {
                refPrevious.setRefNext(refLocal.getRefNext());
                break;
            } else {
                refPrevious = refLocal;
                refLocal = refLocal.getRefNext();
            }

        }

    }

    public String toString() {
        String str = "======================================== List ========================================\n";
        str += "[";
        Node<T> refLocal = refLast;
        while (isNext()) {
            str += refLocal.getValue() + ", ";
            if (refLocal.getRefNext() != null) {
                refLocal = refLocal.getRefNext();
            } else {
                break;
            }
        }
        str += "]\n";
        str += "======================================================================================";
        return str;
    }

}
