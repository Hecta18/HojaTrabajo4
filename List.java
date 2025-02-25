public class List<E> implements AbstractList<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public List() {
        size = 0;
        head = null;
        tail = null;
    }

    public void add(E item) {
        Node<E> newNode = new Node<>(item);
        if (size == 0) {//check list empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;//reference to next node
            tail = newNode;//reference to tail
        }
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<E> current = head;
        Node<E> previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
        if (current == tail) {
            tail = previous;
        }
        size--;
        return current.item;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }//moves current through the list until it reaches index
        return current.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
}
