public class Node<E> {
    protected E item;
    protected Node<E> next;

    public Node(E item) {
        this.item = item;
        this.next = null;
    }
}