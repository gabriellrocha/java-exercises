import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution12 {
    // maior numero de um array

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // leitura de 20 números

        int[] nums = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<20; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        return nums;
    }

    public static int max(int[] array) {
        //retorna o maior número do array

        int maximum = array[0];
        for(int i=1; i<20; i++){
            if(array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}