import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution8 {

    // somar números até que a palavra "sum" seja inserida
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isTrue = true;
        String txt;
        int sum = 0;

        while(isTrue) {
            txt = reader.readLine();
            if (txt.equals("sum")) {
                isTrue = false;
            } else {
                sum += Integer.parseInt(txt);
            }
        }

        System.out.println(sum);
    }
}