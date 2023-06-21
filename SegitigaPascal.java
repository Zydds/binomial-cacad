public class SegitigaPascal {
    public static void cetakEkspansiBinomial(int n, int x, int y) {
        int hasilRumus = (int) Math.pow(x + y, n);
        System.out.println("(" + x + " + " + y + ")^" + n + " = " + hasilRumus);

        if (n > 1) {
            System.out.println("Prediksi suku sebelumnya:");
            int[] koefisien = new int[n + 1];
            koefisien[0] = 1;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j >= 1; j--) {
                    koefisien[j] = koefisien[j] + koefisien[j - 1];
                }
            }

            for (int k = 0; k < n; k++) {
                int pangkatX = (int) Math.pow(x, n - k - 1);
                int pangkatY = (int) Math.pow(y, k + 1);

                int prediksi = koefisien[k] * pangkatX * pangkatY;

                System.out.print(prediksi + " ");
            }

            System.out.println();
        }

        System.out.println("Hasil ekspansi binomial:");
        int[] koefisien = new int[n + 1];
        koefisien[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                koefisien[j] = koefisien[j] + koefisien[j - 1];
            }
        }

        for (int k = 0; k <= n; k++) {
            int pangkatX = (int) Math.pow(x, n - k);
            int pangkatY = (int) Math.pow(y, k);

            int hasil = koefisien[k] * pangkatX * pangkatY;

            System.out.print(hasil + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        int y = 3;

        cetakEkspansiBinomial(n, x, y);
    }
}

