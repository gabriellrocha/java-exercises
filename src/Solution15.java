import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution15 {
    public static void main(String[] args) throws Exception {
        //lê 20 números do teclado e preenche o array

        // copiar os dez primeiros elementos(números) para o primeiro array

        // em seguida, copiar os dez últimos para o segundo array, e exibi-lo,
        // via console, um número por linha


        int[] arrayInt = populateArray();

        int[] primeiroArray = new int[10];
        int[] segundoArray = new int[10];

        for(int i=0; i<10; i++){
            primeiroArray[i] = arrayInt[i];
        }

        for(int i=0; i+10 <20; i++){
            segundoArray[i] = arrayInt[i+10];
        }

        for(int i=0; i<10; i++){
            System.out.println(segundoArray[i]);
        }
    }

    private static int[] populateArray() throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr20 = new int[20];

        for(int i=0; i<20; i++) {
            arr20[i] = Integer.parseInt(reader.readLine());
        }

        return arr20;
    }
}
