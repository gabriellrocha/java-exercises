import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ConsoleReader {

    static BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

    //Como usar a classe BufferedReader para leitura de um fluxo, neste caso via teclado.

    public static String readString() throws Exception {

        return leitor.readLine();
    }

    public static int readInt() throws Exception {

        return Integer.parseInt(leitor.readLine());
    }

    public static double readDouble() throws Exception {
        return Double.parseDouble(leitor.readLine());
    }

    public static boolean readBoolean() throws Exception {

        String texto = leitor.readLine();
        return texto.equals("true");
    }

    public static void main(String[] args) throws Exception {


    }
}
