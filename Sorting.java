import java.util.*;
import java.util.Arrays;


class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2)
            return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}

class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}

class CountingSort {
    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
        int[] count = new int[max + 1];
        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}

class RadixSort {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        int exp = 1;
        int[] output = new int[arr.length];
        while (max / exp > 0) {
            countingSortByDigit(arr, output, exp);
            exp *= 10;
        }
    }

    private static void countingSortByDigit(int[] arr, int[] output, int exp) {
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}

class BucketSort {
    public static void bucketSort(float[] arr) {
        if (arr.length <= 0)
            return;

        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[arr.length];
        for (int i = 0; i < arr.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (float num : arr) {
            int bucketIndex = (int) (num * arr.length);
            buckets[bucketIndex].add(num);
        }

        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            for (float num : bucket) {
                arr[index++] = num;
            }
        }
    }
}

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        // Bubble Sort
        BubbleSort.bubbleSort(arr);
        System.out.println("Bubble Sort: " + Arrays.toString(arr));

        // Selection Sort
        SelectionSort.selectionSort(arr);
        System.out.println("Selection Sort: " + Arrays.toString(arr));

        // Insertion Sort
        InsertionSort.insertionSort(arr);
        System.out.println("Insertion Sort: " + Arrays.toString(arr));

        // Merge Sort
        MergeSort.mergeSort(arr);
        System.out.println("Merge Sort: " + Arrays.toString(arr));

        // Quick Sort
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arr));

        // Heap Sort
        HeapSort.heapSort(arr);
        System.out.println("Heap Sort: " + Arrays.toString(arr));

        // Counting Sort
        int[] countingArr = { 4, 2, 2, 8, 3, 3, 1 };
        CountingSort.countingSort(countingArr);
        System.out.println("Counting Sort: " + Arrays.toString(countingArr));

        // Radix Sort
        int[] radixArr = { 170, 45, 75, 90, 802, 24, 2, 66 };
        RadixSort.radixSort(radixArr);
        System.out.println("Radix Sort: " + Arrays.toString(radixArr));

        // Bucket Sort
        float[] bucketArr = { 0.42f, 0.32f, 0.75f, 0.15f, 0.54f };
        BucketSort.bucketSort(bucketArr);
        System.out.println("Bucket Sort: " + Arrays.toString(bucketArr));
    }
}
