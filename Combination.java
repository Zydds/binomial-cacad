import java.util.Scanner;
public class Combination {


    public static int nCr(int n, int r) {
        if (r > n / 2) {
            r = n - r;
        }
        int[] arr = new int[r + 1];
        arr[0] = 1;
        for (int i = 1; i <= r; i++) {
            arr[i] = arr[i - 1] * (n - i + 1) / i;
        }
        return arr[r];
    }


}
