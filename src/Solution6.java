import java.io.*;

public class Solution6 {
    public static void main(String[] args) throws Exception {

        //media dos números até que -1 seja digitado
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int cont = 0, prox = 0, soma = 0;

        boolean isTrue = true;

        while(isTrue) {
            prox = Integer.parseInt(buffer.readLine());
            if (prox != -1) {
                soma += prox;
                cont++;
            } else {
                isTrue = false;
            }
        }

        System.out.println(soma / cont);
    }
}

