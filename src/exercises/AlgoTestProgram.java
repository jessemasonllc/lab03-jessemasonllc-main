package exercises;

import modules.RModule;

public class AlgoTestProgram {

    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        print(list);
        RModule.selectionSort(list);
        print(list);

        System.out.println("Location of 8 : " + RModule.binarySearch(list, 8));

    }

    public static void print(int[] list) {

        for(int i = 0; i < list.length; i++) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

        //use a for-each loop to print out list
        for(int item : list) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
        System.out.println();
    }
}
