package modules;

import java.util.Arrays;

public class IModule {

    public static int binarySearch(int[] list, int target) {
        int mid;
        int low;
        int high;
        low = 0;

        high = list.length-1;

        while (high >= low) {
            mid = (high + low) / 2;
            if (list[mid] < target) {
                low = mid + 1;
            }
            else if (list[mid] > target) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static  void bubbleSort(int[] list) {
        int temp = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static boolean contains(int[] list, int target) {
        for (int i : list) {
            if(i == target) {
                return true;
            }

        }
        return false;
    }

    public static int indexOf(int[] list, int target) {
        for (int i : list) {
            if(i == target) {
                return i;
            }
        }
        return -1;
    }

    public static void insertionSort(int[] list) {
        int j;
        int temp;
        for (int i = 1; i < list.length; i++) {
            j = i;
            while (j > 0 && list[j] < list[j-1]) {
                temp = list[j];
                list[j] = list[j-1];
                list[j-1] = temp;
                j--;
            }
        }
    }

    private static void merge(int[] list, int[] left, int[] right) {

        int l = left.length;
        int r = right.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                list[k++] = left[i++];
            }
            else {
                list[k++] = right[j++];
            }
        }
        while (i < l) {
            list[k++] = left[i++];
        }
        while (j < r) {
            list[k++] = right[j++];
        }

    }

    public static void mergeSort(int[] list) {
        int n = list.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = list[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = list[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    private static int partition(int[] list, int low, int high) {
        int p = list[high];
        int i = low-1;
        int temp;

        for (int j = low; j <= high-1; j++) {
            if (list[j] < p)
            {
                i++;
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        temp = list[i + 1];
        list[i] = list[high];
        list[high] = temp;

        return (i + 1);
    }

    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length-1);
    }

    private static void quickSort(int[] list, int low, int high) {
        int p;
        if (low < high) {
            p = partition(list, low, high);

            quickSort(list, low, p - 1);
            quickSort(list, p + 1, high);
        }
    }

    public static void selectionSort(int[] list) {
        int i;
        int j;
        int small;
        int temp;
        for (i = 0; i < list.length-1; i++) {
            small = i;
            for (j=i+1; j < list.length; j++) {
                if (list[j] < list[small]) {
                    small = j;
                }
            }
            swap(list, i, small);
  /*          temp = list[i];
            list[i] = list[small];
            list[small] = temp; */
        }
    }

    private static int[] splitFirstHalf(int[] list) {
        return null;
    }

    private static int[] splitSecondHalf(int[] list) {
        return null;
    }

    public static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;

    }
    public static void main(String[] args) {
    int[] data1 = {1, 3, 5, 7, 8, 9};
    int[] data2 = {2, 9, 5, 4, 8, 1, 6};
    System.out.println(Arrays.toString(data1));
    System.out.println(Arrays.toString(data2));

        System.out.println(binarySearch(data1, 2));
        System.out.println(binarySearch(data1, 5));
        System.out.println(binarySearch(data1, 9));

    mergeSort(data2);
    System.out.println("Data 2 sorted: " + Arrays.toString(data2));
    }
}
