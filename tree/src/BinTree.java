

public class BinTree<T extends Comparable<T>> {

    private BinNode<T> root;

    public BinTree() {
        this.root = null;
    }

    public void insert(T content) {
        BinNode<T> newNode = new BinNode<>(content);
        root = insert(root, newNode);
    }

    private BinNode<T> insert(BinNode<T> current, BinNode<T> newNode) {
        if (current == null) {
            return newNode;
        } else if (newNode.getContent().compareTo(current.getContent()) < 0) {
            current.setLeftNode(insert(current.getLeftNode(), newNode));
        } else {
            current.setRightNode(insert(current.getRightNode(), newNode));
        }
        return current;
    }

    public void displayOrdered() {
        System.out.println("========== Showing Elements Ordered ==========");
        displayOrdered(root);
        System.out.println("==============================================");
    }

    private void displayOrdered(BinNode<T> current) {

        if (current != null) {
            displayOrdered(current.getLeftNode());
            System.out.println(current.getContent() + ",");
            displayOrdered(current.getRightNode());
        }
    }

    public void displayPreOrdered() {
        System.out.println("========== Showing Elements Pre-Ordered ==========");
        displayPreOrdered(root);
        System.out.println("==============================================");
    }

    private void displayPreOrdered(BinNode<T> current) {

        if (current != null) {
            System.out.println(current.getContent() + ",");
            displayOrdered(current.getLeftNode());
            displayOrdered(current.getRightNode());
        }
    }

    public void getElement(T content) {
        System.out.println("========== Showing Element Found ==========");
        getElement(root, content);
        System.out.println("===========================================");
    }

    private void getElement(BinNode<T> current, T content) {
        if (current != null) {
            try {
                if (current.getContent().equals(content)) {
                    System.out.println("Here is element: " + current.getContent());
                } else if (content.compareTo(current.getContent()) < 0) {
                    getElement(current.getLeftNode(), content);
                } else {
                    getElement(current.getRightNode(), content);
                }
            } catch (NullPointerException e) {
                System.out.println("Element not found in database");
            }
        }
    }

    public void deleteElement(T content) {
        System.out.println("========== Showing Element Deleted ==========");
        deleteElement(root, content, null, null);
        System.out.println("===========================================");
    }

    private void deleteElement(BinNode<T> local, T content, BinNode<T> son, BinNode<T> father) {
        son = local.getLeftNode();
        if (content.compareTo(root.getContent()) == 0) {
            son = local.getLeftNode();
            if (root.getLeftNode().getRightNode() != null) {
                local = root.getLeftNode().getRightNode();
                father = root.getLeftNode();
                while (local != null) {
                    if (local.getRightNode() == null) {
                        if (local.getLeftNode() != null) {
                            father.setRightNode(local.getLeftNode());
                        } else {
                            local.setLeftNode(root.getLeftNode());
                            local.setRightNode(root.getRightNode());
                            root = local;
                            father.setRightNode(null);
                            break;
                        }
                    }
                    local = local.getRightNode();
                    father = father.getRightNode();
                }
            } else if (son == null) {
                root = local.getLeftNode();
            }


        } else if (content.compareTo(local.getContent()) < 0){
            father = local;
            son = local.getLeftNode();
            if (son.getLeftNode() != null){
                deleteElement(son, content, son.getLeftNode(), father);
            } else {
                deleteElement(son, content, null, father);
            }
        } else if (content.compareTo(local.getContent()) > 0) {
            father = local;
            son = local.getRightNode();
            if (son.getRightNode() != null){
                deleteElement(son, content, son.getRightNode(), father);
            } else {
                deleteElement(son, content, null, father);
            }
        } else {
            if (local.getRightNode() != null){
                father.setLeftNode(local.getRightNode());
            } else if (local.getLeftNode() != null){
                father.setRightNode(local.getLeftNode());
            } else if (local.getRightNode() == null){
                father.setRightNode(null);

            }
        }
        System.out.println(content);

    }

}
