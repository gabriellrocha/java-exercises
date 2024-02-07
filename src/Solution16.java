import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution16 {

    public static void main(String[] args) throws IOException {

        // Preencher um array com quatro Strings via teclado
        // Exibi-las via console na ordem inversa

        ArrayList<String> palavras = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<4; i++) {
            palavras.add(i, reader.readLine());
        }

        for(int i=0; i<palavras.size(); i++) {
            int j = palavras.size() - i -1;
            System.out.println(palavras.get(j));
        }
    }

}
