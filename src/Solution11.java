import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution11 {

    // Bubble Sort, em um ArrayList de Integer

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=5; i++){

            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> orderedList = ascendingOrder(list);

        for(Integer num : orderedList) {
            System.out.println(num);
        }
    }

    public static ArrayList<Integer> ascendingOrder(ArrayList<Integer> list) {

        int aux;

        for(int i=1; i<= list.size()-1; i++) {
           for(int c=0; c < list.size()-i; c++){

               if(list.get(c) > list.get(c+1)) {
                   aux = list.get(c);
                   list.set(c, list.get(c+1));
                   list.set(c+1, aux);
               }
           }
        }
        return list;
    }
}