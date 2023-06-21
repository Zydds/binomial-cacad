import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("menggunakan rumus segitiga pascal (x+y)^n");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n: ");
            int n = scanner.nextInt();

            System.out.print("Masukkan nilai x: ");
            int x = scanner.nextInt();

            System.out.print("Masukkan nilai y: ");
            int y = scanner.nextInt();

            SegitigaPascal.cetakEkspansiBinomial(n, x, y);
        }
    }
}
