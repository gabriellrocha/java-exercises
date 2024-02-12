import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Solution19 {
    public static void main(String[] args) throws Exception {

        // Insira 20 números via teclado e insira-os em uma lista
        // Em seguida, classifique-os em três outras listas
        // divisível por 3
        // divisível por 2
        // restantes
        // se for divisível por 3 e 2, adicionar em ambas as listas

        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> listDivisibleByThree = new ArrayList<>();
        ArrayList<Integer> listDivisibleByTwo = new ArrayList<>();
        ArrayList<Integer> listRemaining = new ArrayList<>();

        listMain = fillList();

        for(Integer number : listMain) {

            if(divisibleByThree(number)){
                listDivisibleByThree.add(number);
            }

            if(divisibleByTwo(number)){
                listDivisibleByTwo.add(number);
            }

            if(!divisibleByThree(number) && !divisibleByTwo(number)) {
                listRemaining.add(number);
            }
        }

        printList(listDivisibleByThree);
        printList(listDivisibleByTwo);
        printList(listRemaining);

    }

    public static void printList(List<Integer> list) {

        for(Integer number : list) {
            System.out.println(number);
        }
    }

    private static ArrayList<Integer> fillList() throws IOException{

        ArrayList<Integer> array = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        return array;
    }

    private static boolean divisibleByThree(int number) {
        return number % 3 == 0;
    }

    private static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }
}

