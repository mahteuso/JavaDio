public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        Node<String> firstInQueue = new Node<>();
        Node<String> secondInQueue = new Node<>();
        Node<String> thirdInQueue = new Node<>();
        System.out.println(queue.isEmpty());
        firstInQueue.setValue("I'm a first");
        secondInQueue.setValue("I'm a second");
        thirdInQueue.setValue("I'm a third");


        queue.enqueue(firstInQueue);
        queue.enqueue(secondInQueue);
        queue.enqueue(thirdInQueue);
        System.out.println(queue);

        queue.dequeue();

        System.out.println(queue);


        queue.dequeue();

        System.out.println(queue);

        queue.dequeue();

        System.out.println(queue);
    }
}
