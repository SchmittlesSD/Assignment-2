public class Quick {

    // Quick Sort function
    public static void QuickSort(int[] A, int start, int end) {
        if (start < end) {
            int pIndex = Partition(A, start, end);
            QuickSort(A, start, pIndex - 1);
            QuickSort(A, pIndex + 1, end);
        }
    }

    // Partition function
    static int Partition(int[] A, int start, int end) {
        int pivot = A[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (A[j] < pivot) {
                i = i + 1;
                swap(A, i, j);
            }
        }

        swap(A, i + 1, end);
        return i + 1;
    }

    // Swap function
    static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    /* public static void main(String[] args) {
        int[] A = {10, 7, 8, 9, 1, 5};
        int n = A.length;

        QuickSort(A, 0, n - 1);

        for (int val : A) {
            System.out.print(val + " ");
        }
    } */
}

