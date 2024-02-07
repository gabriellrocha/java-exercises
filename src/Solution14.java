import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Solution14 {
    public static void main(String[] args) throws Exception {

        // Preencher um array de strings via teclado
        // preencher um array de inteiros com os tamanhos das String cujo índice coincide entre os arrays

        String[] arrayStrings = insertStrings();
        int[] arrayNumbers = lengthString(arrayStrings);

        for(int i=0; i<10; i++){
            System.out.println(arrayNumbers[i]);
        }
    }

    private static String[] insertStrings() throws IOException {

        String[] names = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10; i++){
            names[i] = reader.readLine();
        }

        return names;
    }

    private static int[] lengthString(String[] names)  {

        int[] lengthStringArray = new int[10];
        for(int i=0; i<10; i++) {
            lengthStringArray[i] = names[i].length();
        }

        return lengthStringArray;
    }
}
