public class Main {
    public static void main(String[] args) {
        LinkedList<String> listLinked = new LinkedList<>();
        Node<String> name1 = new Node<>("Mateus Laranjeira");
        Node<String> name2 = new Node<>("Julia Leite");
        Node<String> name3 = new Node<>("Helena Dias");

        listLinked.add(name1);
        listLinked.add(name2);
        listLinked.add(name3);

        System.out.println(listLinked.getSize());
        System.out.println(listLinked);

        listLinked.remove("Julia Leite");
        System.out.println(listLinked);
        listLinked.remove("Mateus Laranjeira");
        System.out.println(listLinked);


        System.out.println(listLinked.getSize());

        listLinked.add(name2);
        System.out.println(listLinked);
        System.out.println(listLinked.getSize());

        listLinked.add(name1);
        System.out.println(listLinked);
        System.out.println(listLinked.getSize());

        listLinked.add(name1);
        System.out.println(listLinked);
        System.out.println(listLinked.getSize());

        listLinked.remove("Helena Dias");
        System.out.println(listLinked);
        System.out.println(listLinked.getSize());


    }
}
