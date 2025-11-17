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

                Merge.merge(A, j, mid, right);

                j = j + 2 * i;
            }

            i = i * 2;

        }
    }
}
