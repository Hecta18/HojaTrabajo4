public class Stack<E> implements abstractStack<E> {
    private int size;
    private Node<E> top;

    public Stack() {
        size = 0;
        top = null;
    }

    public void push(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public E pop() {
        if (size == 0) {
            return null;
        }
        E item = top.item;
        top = top.next;
        size--;
        return item;
    }

    public E peek() {
        if (size == 0) {
            return null;
        }
        return top.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
}
