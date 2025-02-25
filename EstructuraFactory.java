public class EstructuraFactory  {
    public static <E> AbstractStack<E> crearStack() {
        return new Stack<>();
    }

    public static <E> AbstractList<E> crearLista() {
        return new ListP<>();
    }
}
