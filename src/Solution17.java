import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution17 {

    public static void main(String[] args) throws Exception {

        // descobrir a maior String dentre as informadas, se houver mais de uma, tem que identificá-las

        ArrayList<String> strings = readStrings();

        ArrayList<String> stringsBigger = longestString(strings);

        for(String s : stringsBigger) {
            System.out.println(s);
        }

    }

    private static ArrayList<String> readStrings() throws IOException {
        // lê cinco String via teclado e insere no ArrayList, retornando o mesmo.

        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            strings.add(reader.readLine());
        }
        return strings;
    }

    private static ArrayList<String> longestString(ArrayList<String> strings) {

        ArrayList<String> longestStringList = new ArrayList<>();

        int bigger = strings.get(0).length();

        // Retorna o comprimento da maior String contida ArrayList
        for(int i=0; i< strings.size(); i++) {
            if(strings.get(i).length() > bigger) {
                bigger = strings.get(i).length();
            }
        }

        /* Preenche um novo ArrayList com as Strings que tiverem no mínimo, o mesmo comprimento
           da maior String no ArrayList recebido na chamada deste método.
        */

        for(String s : strings) {
            if(s.length() >= bigger) {
                longestStringList.add(s);
            }
        }
        return longestStringList;
    }
}