import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pilih yang ingin dijalankan:");
        System.out.println("1. SegitigaPascal");
        System.out.println("2. BinomialKoefisien");
        System.out.println("3. CariN");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    jalankanSegitigaPascal();
                    break;
                case 2:
                    jalankanCombination();
                    break;
                case 3:
                    jalankanCariN();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void jalankanSegitigaPascal() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Masukkan nilai n: ");
            int n = scanner.nextInt();
            System.out.println("x dan y tidak bisa huruf");
            System.out.print("Masukkan nilai x: ");
            int x = scanner.nextInt();

            System.out.print("Masukkan nilai y: ");
            int y = scanner.nextInt();

            SegitigaPascal.cetakEkspansiBinomial(n, x, y);
        }
    }

    public static void jalankanCombination() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan nilai n: ");
        int n = scanner.nextInt();
        System.out.println("masukan nilai a: ");
        int a = scanner.nextInt();
        System.out.println("masukan nilai x: ");
        int x = scanner.nextInt();
        System.out.println("masukan nilai y: ");
        int y = scanner.nextInt();
        int q = n - a + 1;
        int r = a - 1;
        int count = Combination.nCr(n, a - 1) * (int) Math.pow(x, q) * (int) Math.pow(y, r);
        System.out.println("dengan rumus Kombinasi(n,a-1)x^n-a+1*y^a-1");
        System.out.println(count);
    }

    public static void jalankanCariN() {
        System.out.println("work in progress");
        try {
            Process process = Runtime.getRuntime().exec("javac CariN.java");
            process.waitFor();

            process = Runtime.getRuntime().exec("java CariN");
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
