import java.util.ArrayList;
import java.util.Random;

public class Main {

    // Main Sort Function
    public static void main(String[] args) {

        Random random = new Random();

        // 5 Lists Total
        for (int count = 1; count < 51; count++) {
            int size = (count * 1000) + 1;

            // Elements (integers) can be 0-50000
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                arr.add(random.nextInt(50000));
            }

            ArrayList<Long> runtime = new ArrayList<>();

            // BottomUp Sort
            int[] bottomUpArray = toArray(arr);
            long start = System.nanoTime();
            BottomUp.BottomUpSort(bottomUpArray, bottomUpArray.length);
            long stop = System.nanoTime();
            runtime.add(stop - start);

            // Merge Sort
            int[] mergeArray = toArray(arr);
            start = System.nanoTime();
            Merge.MergeSort(mergeArray, mergeArray.length);
            stop = System.nanoTime();
            runtime.add(stop - start);

            // Quick Sort
            int[] quickArray = toArray(arr);
            start = System.nanoTime();
            Quick.QuickSort(quickArray, 0, quickArray.length - 1);
            stop = System.nanoTime();
            runtime.add(stop - start);

            // Radix Sort
            int[] radixArray = toArray(arr);
            start = System.nanoTime();
            Radix.RadixSort(radixArray, radixArray.length, 5);
            stop = System.nanoTime();
            runtime.add(stop - start);

            System.out.println(runtime);
        }
    }

    // Convert ArrayList to Array
    public static int[] toArray(ArrayList<Integer> list) {
        int[] converted = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            converted[i] = list.get(i);
        }
        return converted;
    }

    // Convert Array to ArrayList
    public static ArrayList<Integer> toArrayList(int[] converted) {
        ArrayList<Integer> reverted = new ArrayList<>();
        for (int val : converted) {
            reverted.add(val);
        }
        return reverted;
    }
}