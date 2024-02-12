import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution20 {
    public static void main(String[] args) throws Exception {

        // lê cinco String via teclado
        // remover o terceiro elemento
        // inverter a ordem da lista, em seguida, exibi-la

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<5; i++){
            list.add(reader.readLine());
        }

        list.remove(2);
        Collections.reverse(list);

        for(String s : list) {
            System.out.println(s);
        }
    }
}