import java.io.*;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        //exibir a soma até que -1 seja digitado

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = 0 , soma = 0;

        while(number != -1) {
            number = Integer.parseInt(reader.readLine());
            soma += number;

        }

        System.out.println(soma);
    }
}