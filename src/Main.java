import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String line, path;

        // Substitui pelo caminho onde estiver o arquivo desejado para leitura
        path = "C://Users//gabri//Desktop//teste.txt";

        // leitura de arquivos
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path));

        // armazenando o fluxo lido no buffer
        BufferedReader buffer = new BufferedReader(inputStreamReader);

        while((line = buffer.readLine()) != null) {
            System.out.println(line);
        }
    }
}
