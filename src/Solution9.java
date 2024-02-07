import java.io.*;

/* 
Even and odd digits

*/

public class Solution9 {

    public static int even;
    public static int odd;

    // estudo sobre variáveis estáticas
    // descobrir quantos dígitos de um determinado número são pares/impares

    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String numString = buffer.readLine();

        int quantity = numString.length();

        while(quantity > 0) {

            int rest = Integer.parseInt(numString.substring(0, quantity)) % 10;
            if(rest % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            quantity--;
        }

        System.out.print("Even:" + even + " Odd:" + odd);
    }
}