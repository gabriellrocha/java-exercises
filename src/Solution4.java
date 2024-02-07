import java.io.*;

public class Solution4 {
    public static void main(String[] args) throws Exception {

        // descubra qual é o número do meio entre tres opções inserida via teclado

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        System.out.println(middleNumber(n1, n2, n3));
    }

    public static int middleNumber(int a, int b, int c) {

        int maior, meio;

        if(a >= b && a >= c) {
            maior = a;
            if(b >= c) {
                meio = b;
            } else {
                meio = c;
            }

        } else if (b >= c) {
            maior = b;

            if(a >= c) {
                meio = a;
            } else {
                meio = c;
            }

        } else {
            maior = c;
            if(a >= b) {
                meio = a;
            } else {
                meio = b;
            }
        }
    return meio;
    }

}