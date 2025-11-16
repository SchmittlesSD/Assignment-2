public class Radix {

    public static void RadixSort(int[] A, int n, int d) {

        int[] A = 0;
        int n = 0;
        int d = 0;

        for (i = 1; i < d; i++) {
            A = CountingSort(a, n, digit = i)
            return A
        }

    }

    static void CountSorting(int arr[], int n, int exp) {

        int output[] = new int[n];
        int i;
        int count[] = new int[10];

        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
