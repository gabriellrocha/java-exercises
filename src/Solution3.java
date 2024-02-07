import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws Exception {

        // Ler um número <= 999
        // verifica se o mesmo é par ou ímpar
        // verifica a quantidade de dígitos. Podendo ser um, dois ou três.

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bf.readLine());

        boolean evenOrOdd = number % 2 == 0 ? true : false;

        int numerals = numberOfDigits(number);

        if(evenOrOdd) {
            if(numerals == 1) {
                System.out.println("even single-digit number");

            } else if (numerals == 2) {
                System.out.println("even two-digit number");

            } else if (numerals == 3) {
                System.out.println("even three-digit number");
            }

        } else {

            if(numerals == 1) {
                System.out.println("odd single-digit number");

            } else if (numerals == 2) {
                System.out.println("odd two-digit number");

            } else if (numerals == 3) {
                System.out.println("odd three-digit number");
            }
        }
    }

    public static int numberOfDigits(int number) {

        if(number < 10) {
            return 1;

        } else if (number < 100) {
            return 2;

        } else if (number < 1000) {
            return 3;
        }

        // if it has more than three digits
        return -1;
    }
}