import java.util.Iterator;

public interface AbstractList<E> {
    void add(E element);
    // void add(int index, E element); //at a specific position
    E remove(int index); 
    E get(int index); 
    // E set(int index, E element); //at a specific position
    int size(); 
    boolean isEmpty();
    // void clear(); 
    // boolean contains(E element); 
    // int indexOf(E element); 
    Iterator<String> iterator();
}
