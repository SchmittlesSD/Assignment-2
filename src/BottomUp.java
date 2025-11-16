public class BottomUp {

    static void BottomUpSort(int[] A, int n) {

        int[] A = 0;
        int n = 0;
        int i = 1;
        int j = 0;

        if (n > 2) {
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

                merge(A, j, mid, right)

                j = j + 2 * i
            }

            i = i * 2

        }

    }

}
