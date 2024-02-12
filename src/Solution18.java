import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Solution18 {
    public static void main(String[] args) throws Exception {
        //// descobrir a menor String dentre as informadas, se houver mais de uma, tem que identificá-las

        ArrayList<String> listFull = preencher();
        ArrayList<String> listSmaller = tamanho(listFull);

        for(String s : listSmaller){
            System.out.println(s);
        }
    }

    private static ArrayList<String> preencher() throws IOException{

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++) {
            list.add(reader.readLine());
        }
        return list;

    }

    private static ArrayList<String> tamanho(ArrayList<String> list) {

        int smaller = list.get(0).length();
        ArrayList<String> smallestString = new ArrayList<>();

        for(int i=0; i<list.size(); i++) {
            if(list.get(i).length() <= smaller) {
                smaller = list.get(i).length();
            }
        }

        for(String s : list) {
            if(s.length() <= smaller) {
                smallestString.add(s);
            }
        }

        return smallestString;
    }
}

