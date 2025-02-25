public class Stack<E> implements AbstractStack<E> {
    private int size;
    private Node<E> top;

    public Stack() {
        size = 0;
        top = null;
    }

    public void push(E item) {
        Node<E> newNode = new Node<>(item); 
        newNode.next = top;
        //the new node points to the previous top node,
        //maintaining the chain of nodes that form the stack.
        top = newNode;
        //top reference of the stack is updated 
        //to point to the new nodes
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