import java.util.Arrays;

public class Radix {

    // Radix Sort Function
    public static void RadixSort(int[] A, int n, int d) {

        int factor = 1;

        for (int i = 0; i < d; i++) {
            CountSorting(A, n, factor);
            factor *= 10;
        }

    }

    // Counting Sort Function
    static void CountSorting(int arr[], int n, int exp) {

        int output[] = new int[n];
        int count[] = new int[10];

        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
