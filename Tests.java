import org.junit.Test;

public class Tests {
    @Test
    public void test1() {
        System.out.println(InToPost.infixToPostfix("( A + ( B - C ) ) * D"));
    }

    @Test
    public void test2() {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        System.out.println(stack.size() + "/n" +
        stack.peek() + "/n" +
        stack.pop() + "/n" +
        stack.isEmpty());
    }
}
