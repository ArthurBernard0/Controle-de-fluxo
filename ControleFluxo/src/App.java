import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();

            Contador.contar(n1, n2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String aviso) {
        super(aviso);
    }
}

class Contador {
    static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 > n2) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }

        for (int i = 1; i <= (n2 - n1); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
