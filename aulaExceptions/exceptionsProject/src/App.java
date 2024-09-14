import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com o dado");
            int x = Integer.parseInt(sc.nextLine());
            int y = 100 / x;
            System.out.println("Resultado: " + y);

        } catch (ArithmeticException e) {
            System.out.println("Operação inválida");
            System.out.println("Detalhamento do erro: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("String inválida");
            System.out.println("Detalhamento do erro: " + e.getMessage());

        }
    }
}
