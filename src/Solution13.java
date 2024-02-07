import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Solution13 {

    // preencher um array de 10 posições com 8 strings vindas do teclado
    // exibir as 10 posições do array na ordem decrescente

    public static void main(String[] args) throws Exception {
        //write your code here
        String[] nomes = preencherArray();
        for(int i=9; i>=0; i--){

            System.out.println(nomes[i]);
        }
    }

    public static String[] preencherArray() throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] stringss = new String[10];

        for(int i=0; i<8; i++) {
            stringss[i] = buffer.readLine();
        }
        return stringss;
    }

}