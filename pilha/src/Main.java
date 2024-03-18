public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        Node primeiro = new Node();
        Node segundo = new Node();
        Node terceiro = new Node();
        primeiro.setValue("Sou o primeiro");
        segundo.setValue("Sou o segundo");
        terceiro.setValue("Sou o terceiro");

        stack.push(primeiro);
        stack.push(segundo);
        stack.push(terceiro);

        System.out.println(stack.isEmpty());
        stack.getAll();

        System.out.println(stack.top());
    }
}
