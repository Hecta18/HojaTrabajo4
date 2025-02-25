public class InToPost {
    public static String infixToPostfix(String infix) {
        String postfix = "";
        Stack<String> stack = new Stack<String>();
        String[] tokens = infix.split(" ");
        ListP<String> infixList = new ListP<String>();
        int i;
        for(i=0;i<tokens.length;i++){
            infixList.add(tokens[i]);
        }//create list of tokens

        //split the string by chunks according to the indicated symbol 
        for (String token : infixList) {
            if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.peek().equals("(")) {//peek the top of the stack
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
        return postfix;
    }

    private static int precedence(String operator) {
        if (operator.equals("+") || operator.equals("-")) {
            return 1;
        } else if (operator.equals("*") || operator.equals("/")) {
            return 2;
        } else {
            return 0;
        }
    }
}
