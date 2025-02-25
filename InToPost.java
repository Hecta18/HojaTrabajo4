
import java.util.Iterator;

public class InToPost {
    private static InToPost instancia;

    private InToPost() {} // Constructor privado

    public static InToPost getInstancia() {
        if (instancia == null) {
            instancia = new InToPost();
        }
        return instancia;
    }
    
    public String infixToPostfix(String infix) {
        String postfix = "";
        AbstractStack<String> stack = EstructuraFactory.crearStack();
        AbstractList<String> infixList = EstructuraFactory.crearLista();

        for (String token : infix.split(" ")) {
            infixList.add(token);
        }

  
        Iterator<String> iterator = infixList.iterator();
        while (iterator.hasNext()) {
            String token = iterator.next();
            if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.peek().equals("(")) {
                    postfix += stack.pop() + " ";
                }
                stack.pop();
            } else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                while (!stack.isEmpty() && precedence(token) <= precedence(stack.peek())) {
                    postfix += stack.pop() + " ";
                }
                stack.push(token);
            } else {
                postfix += token + " ";
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop() + " ";
        }
        return postfix.trim();
    }

    private int precedence(String operator) {
        if (operator.equals("+") || operator.equals("-")) return 1;
        if (operator.equals("*") || operator.equals("/")) return 2;
        return 0;
    
    }
}