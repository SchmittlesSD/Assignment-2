import java.util.LinkedList;
import java.util.Random;


public class MainSorter {

    public static void main(String[] args) {
        for (int count = 0; count < 3; count++) {
            Random random = new Random();
            int size = random.nextInt(50000);

            LinkedList<Integer> arr = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                arr.add(random.nextInt(50000)); // range of random numbers
            }

            LinkedList<Integer> arr1 = new LinkedList<>(arr);
            LinkedList<Integer> arr2 = new LinkedList<>(arr);
            LinkedList<Integer> arr3 = new LinkedList<>(arr);
            LinkedList<Integer> arr4 = new LinkedList<>(arr);
            LinkedList<Long> runtime = new LinkedList<>();
            long start = 0;
            long stop = 0;

            start = System.nanoTime();
            BottomUp.bottomUpSort(arr1, 0, arr1.size() - 1);
            stop = System.nanoTime();
            long bottomUpTotal = stop - start;
            runtime.add(bottomUptotal);

            start = System.nanoTime();
            Merge.mergeSort(arr2, 0, arr2.size() - 1);
            stop = System.nanoTime();
            long mergeTotal = stop - start;
            runtime.add(mergeTotal);

            start = System.nanoTime();
            Quick.quickSort(arr3, 0, arr3.size() - 1);
            stop = System.nanoTime();
            long quickTotal = stop - start;
            runtime.add(quickTotal);

            start = System.nanoTime();
            Radix.radixSort(arr4, 0, arr4.size() - 1);
            stop = System.nanoTime();
            long radixTotal = stop - start;
            runtime.add(radixTotal);

            System.out.println(runtime);
        }
    }
}