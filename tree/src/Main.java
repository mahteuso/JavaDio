public class Main {
    public static void main(String[] args) {
        BinTree<String> tree = new BinTree<>();

        tree.insert("Mateus Laranjeira");
        tree.insert("Julia Leite");
        tree.insert("Madalena Leite");

        tree.insert("Helena Dias");
        tree.insert("Marco Maria");

        tree.displayPreOrdered();
        tree.displayOrdered();
        tree.getElement("Madalena Leite");
        tree.displayOrdered();
        tree.deleteElement("Helena Dias");

        tree.displayPreOrdered();
        tree.displayOrdered();
    }
}
