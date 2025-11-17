public class BottomUp {

    // Bottom Up Sort Function
    public static void BottomUpSort(int[] A, int n) {

        if (n < 2) {
            return;
        }

        int i = 1;
        while (i < n) {

            int j = 0;
            while (j < n) {

                int mid = j + i;
                int right = j + 2 * i;

                if (mid >= n) {
                    break;
                }

                if (right > n) {
                    right = n;
                }

                merge (A, j, mid, right);

                j = j + 2 * i;
            }

            i = i * 2;

        }
    }

    static void merge(int[] A, int start, int mid, int end) {

        // Checking length
        int left = mid - start;
        int right = end - mid;

        // Create temporary arrays based on size of left and right
        int[] L = new int[left];
        int[] R = new int[right];

        // Copy data from A into temporary arrays
        for (int i = 0; i < left; i++) L[i] = A[start + i];
        for (int i = 0; i < right; i++) R[i] = A[mid + i];

        int i = 0;
        int j = 0;
        int k = start;

        // Merge elements from L and R back into A in sorted order
        while (i < left && j < right) {
            if (L[i] <= R[j]) A[k++] = L[i++];  // if smaller take number
            else A[k++] = R[j++];
        }

        // Clean up remaining elements
        while (i < left) A[k++] = L[i++];
        while (j < right) A[k++] = R[j++];
    }
}
