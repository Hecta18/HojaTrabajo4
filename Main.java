package HojaTrabajo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = br.readLine();
            System.out.println(InToPost.infixToPostfix(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
