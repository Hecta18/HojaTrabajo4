import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void test1() {
       
        String infix = "( A + ( B - C ) ) * D";
        String expectedPostfix = "A B C - + D *";  

        String result = InToPost.getInstancia().infixToPostfix(infix);

        assertEquals("La conversión infijo a postfijo es incorrecta", expectedPostfix, result);
    }

    @Test
    public void test2() {
        Stack<String> stack = new Stack<String>();
        stack.push("A");

        System.out.println(stack.size() + "\n" + 
                           stack.peek() + "\n" +
                           stack.pop() + "\n" +
                           stack.isEmpty());
    }

    @Test
public void test3() {
    ListP<String> list = new ListP<String>();
    list.add("A");
    list.add("B");
    list.add("C");


    System.out.println("Tamaño inicial: " + list.size());

    list.remove(0);


    System.out.println("Tamaño después de eliminar: " + list.size());
    System.out.println("Elemento en índice 1: " + list.get(1));

    list.remove(1);
    list.remove(0);


    System.out.println("¿Está la lista vacía? " + list.isEmpty());
}
    InToPost convertidor = InToPost.getInstancia();

    @Test
    public void testInfixToPostfix1() {
        String infijo = "( A + B )";
        String esperado = "A B +";
        String resultado = convertidor.infixToPostfix(infijo);
        
        // Imprimir el resultado y la comparación
        System.out.println("Entrada infija: " + infijo);
        System.out.println("Esperado: " + esperado);
        System.out.println("Resultado: " + resultado);
        
        // Comparación de la salida
        assertEquals(esperado, resultado, "A B +");
    }
    
    @Test
    public void testInfixToPostfix2() {
        String infijo = "( A + ( B - C ) ) * D";
        String esperado = "A B C - + D *";
        String resultado = convertidor.infixToPostfix(infijo);
        
        // Imprimir el resultado y la comparación
        System.out.println("Entrada infija: " + infijo);
        System.out.println("Esperado: " + esperado);
        System.out.println("Resultado: " + resultado);
        
        // Comparación de la salida
        assertEquals(esperado, resultado, "A B C - + D *");
    }
    
    @Test
    public void testInfixToPostfix3() {
        String infijo = "A + B * C";
        String esperado = "A B C * +";
        String resultado = convertidor.infixToPostfix(infijo);
        
        // Imprimir el resultado y la comparación
        System.out.println("Entrada infija: " + infijo);
        System.out.println("Esperado: " + esperado);
        System.out.println("Resultado: " + resultado);
        
        // Comparación de la salida
        assertEquals(esperado, resultado, "A B C * +");
    }
    
    @Test
    public void testInfixToPostfix4() {
        String infijo = "( A + B ) * ( C + D )";
        String esperado = "A B + C D + *";
        String resultado = convertidor.infixToPostfix(infijo);
        
        // Imprimir el resultado y la comparación
        System.out.println("Entrada infija: " + infijo);
        System.out.println("Esperado: " + esperado);
        System.out.println("Resultado: " + resultado);
        
        // Comparación de la salida
        assertEquals(esperado, resultado, "A B + C D + *");
    }
    
    @Test
    public void testInfixToPostfixWithError() {
        String infijo = "( A + B * C";
        String resultado = convertidor.infixToPostfix(infijo);
        
        // Imprimir el resultado
        System.out.println("Entrada infija con error: " + infijo);
        System.out.println("Resultado: " + resultado);
        
        // Verificar que el resultado no sea nulo
        assertNotNull(resultado, "La conversión no debería fallar en caso de error");

    }
}