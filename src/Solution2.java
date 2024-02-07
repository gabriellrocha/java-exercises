import java.io.*;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        // Igualdade entre Strings

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bf.readLine();
        String name2 = bf.readLine();

        if(name1.equals(name2)) {
            System.out.println("The names are identical");

        } else if (name1.length() == name2.length()) {
            System.out.println("The names are same length");

        }
    }
}