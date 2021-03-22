package modules;

import java.util.Arrays;

public class RModule {

    public static int binarySearch(int[] list, int target)
    {
        return binarySearch(list, target, 0, list.length-1);
    }

    private static int binarySearch(int[] list, int target, int min, int max) {
        int low = min;
        int mid;
        int high = max;

        while (high >= low) {
            mid = (high + low) / 2;
            if (list[mid] < target) {
                low = mid + 1;
            }
            else if (list[mid] > target){
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return - 1;
    }

    public static void selectionSort(int[] list) {
        /*
        int i;
        int small = 0;

        for (i = 0; i < list.length - 1; i++) {

            small = i;

            for (int j = i + 1; j < list.length; j++) {

                if (list[j] < list[small]) {
                    small = j;
                }
            }
            swap(list, i, small);
        } */
        selectionSort(list, 0);
    }

    private static void selectionSort(int[] list, int start) {
        int i;
        int small = 0;

        for (i = start; i < list.length - 1; i++) {

            small = i;

            for (int j = i + 1; j < list.length; j++) {

                if (list[j] < list[small]) {
                    small = j;
                }
            }
            swap(list, i, small);
        }
    }

    public static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public static void main(String[] args) {
        int[] data1 = {1, 3, 5, 7, 8, 9};
        int[] data2 = {2, 9, 5, 4, 8, 1, 6};

        System.out.println(binarySearch(data1, 2));
        System.out.println(binarySearch(data1, 5));
        System.out.println(binarySearch(data1, 9));

        selectionSort(data2);

        System.out.println("Data 2 sorted: " + Arrays.toString(data2));
    }
}
