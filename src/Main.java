import java.util.ArrayList;
import java.util.Random;

public class Main {

    // Convert Array to Int
    public static int[] toArray(ArrayList<Integer> list) {
        int[] converted = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            converted[i] = list.get(i);
        }
        return converted;
    }

    // Convert Int to Array
    public static ArrayList<Integer> toArrayList(int[] converted) {
        ArrayList<Integer> reverted = new ArrayList<>();
        for (int val : converted) {
            reverted.add(val);
        }
        return reverted;
    }

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
            int[] unsorted1 = toArray(arr);
            long start = System.nanoTime();
            BottomUp.BottomUpSort(unsorted1, unsorted1.length);
            long stop = System.nanoTime();
            runtime.add(stop - start);
            ArrayList<Integer> sorted1 = toArrayList(unsorted1);

            // Merge Sort
            int[] unsorted2 = toArray(arr);
            start = System.nanoTime();
            Merge.MergeSort(unsorted2, unsorted2.length);
            stop = System.nanoTime();
            runtime.add(stop - start);
            ArrayList<Integer> sorted2 = toArrayList(unsorted2);

            // Quick Sort
            int[] unsorted3 = toArray(arr);
            start = System.nanoTime();
            Quick.QuickSort(unsorted3, 0, unsorted3.length - 1);
            stop = System.nanoTime();
            runtime.add(stop - start);
            ArrayList<Integer> sorted3 = toArrayList(unsorted3);

            // Radix Sort
            int[] unsorted4 = toArray(arr);
            start = System.nanoTime();
            Radix.RadixSort(unsorted4, unsorted4.length, 5);
            stop = System.nanoTime();
            runtime.add(stop - start);
            ArrayList<Integer> sorted4 = toArrayList(unsorted4);

            System.out.println(runtime);
        }
    }
}