import java.util.Arrays;
import java.util.Comparator;

public class SimpleSortDriver {

   public static void main(String[] args) {

       Comparator<Integer> comp = Comparator.naturalOrder();

       Integer[] arr1 = {5, 1, 9, 3, 7, 6};
       Integer[] bubble1 = Arrays.copyOf(arr1, arr1.length);
       Integer[] insertion1 = Arrays.copyOf(arr1, arr1.length);

       System.out.println("TEST 1: Unsorted Array");
       System.out.println("Original: " + Arrays.toString(arr1));

       SimpleSorter.bubbleSort(bubble1, comp);
       System.out.println("Bubble Sort: " + Arrays.toString(bubble1));
       
       SimpleSorter.insertionSort(insertion1, comp);
       System.out.println("Insertion Sort: " + Arrays.toString(insertion1));

       Integer[] arr2 = {9, 7, 6, 5, 3, 1};
       Integer[] bubble2 = Arrays.copyOf(arr2, arr2.length);
       Integer[] insertion2 = Arrays.copyOf(arr2, arr2.length);

       System.out.println("\nTEST 2: Reverse-Sorted Array");
       System.out.println("Original: " + Arrays.toString(arr2));

       SimpleSorter.bubbleSort(bubble2, comp);
       System.out.println("Bubble Sort: " + Arrays.toString(bubble2));

       SimpleSorter.insertionSort(insertion2, comp);
       System.out.println("Insertion Sort: " + Arrays.toString(insertion2));

       Integer[] arr3 = {1, 3, 5, 6, 7, 9};
       Integer[] bubble3 = Arrays.copyOf(arr3, arr3.length);
       Integer[] insertion3 = Arrays.copyOf(arr3, arr3.length);

       System.out.println("\nTEST 3: Already-Sorted Array");
       System.out.println("Original: " + Arrays.toString(arr3));

       SimpleSorter.bubbleSort(bubble3, comp);
       System.out.println("Bubble Sort: " + Arrays.toString(bubble3));

       SimpleSorter.insertionSort(insertion3, comp);
       System.out.println("Insertion Sort: " + Arrays.toString(insertion3));
   }
}