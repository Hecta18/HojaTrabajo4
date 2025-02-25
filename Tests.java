import org.junit.Test;

public class Tests {
    @Test
    public void test1() {
        System.out.println(InToPost.infixToPostfix("( A( B - C ) ) * D"));
    }

    @Test
    public void test2() {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        System.out.println(stack.size()+"/n" +
        stack.peek()+"/n" +
        stack.pop()+"/n" +
        stack.isEmpty());
    }

    @Test
    public void test3() {
        ListP<String> list = new ListP<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove(1);
        list.remove(0);
        System.out.println(list.isEmpty());
    }
}
