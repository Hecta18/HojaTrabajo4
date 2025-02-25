import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the file path: /n");
        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) {
            String filePath = br1.readLine();
            try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String input = br.readLine();
            System.out.println(InToPost.getInstancia().infixToPostfix(input)); // Usamos Singleton
            System.out.println(InToPost.getInstancia().infixToPostfix(input));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
