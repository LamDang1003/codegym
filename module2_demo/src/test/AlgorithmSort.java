package test;

import java.util.Arrays;

public class AlgorithmSort {

    public static void main(String[] args) {
        int[] arr = {32, 1, 59, 18, 12};

//        selectionSort(arr);
        bubbleSort(arr);
//        insertionSort(arr);
//        display(arr);
    }

    private static void selectionSort(int[] arr) {
        int min;
        for(int j=0; j < arr.length;j++){
            min = j;
            for(int k=j+1; k<=arr.length-1; k++)
            {
                if(arr[k] > arr[min])
                    min = k;
            }
            int temp = arr[min];
            arr[min] = arr[j];
            arr[j] = temp;

            System.out.printf("Loop %d: ", j + 1);
            display(arr);
            System.out.println();
        }



//        int length = arr.length;
//        for (int i = 0; i < length; i++) {
//            int min_pos = i;
//            for (int j = i; j < length; j++) {
//                if (arr[min_pos] > arr[j])
//                    min_pos = j;
//            }
//
//            if (min_pos != i) {
//                int tmp = arr[min_pos];
//                arr[min_pos] = arr[i];
//                arr[i] = tmp;
//            }
//
//            System.out.printf("Loop %d: ", i + 1);
//            display(arr);
//            System.out.println();
//        }
    }

    private static void insertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int tmp = arr[i];
            int pos = i - 1;

            while (pos >= 0 && arr[pos] > tmp) {
                arr[pos + 1] = arr[pos];
                pos--;
            }

            arr[pos + 1] = tmp;
        }
    }

    private static void bubbleSort(int[] arr) {
//        for(int j=arr.length-1; j>=0; j--)
//        {
//            for(int k=0; k<j; k++)
//            {
//                if(arr[k] > arr[k+1])
//                {
//                    int temp = arr[k];
//                    arr[k] = arr[k+1];
//                    arr[k+1] = temp;
//                }
//            }
//
//            System.out.printf("Loop %d: ", j + 1);
//            display(arr);
//            System.out.println();
//        }

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length- i -1; j++) {
                if(arr[j]> arr[j+1]){
                    int tmp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= tmp;
                }
            }

            System.out.println(Arrays.toString(arr));
        }

//        int length = arr.length;
//
//        for (int i = 0; i < length; i++) {
//            boolean isSorted = true;
//
//            for (int j = 0; j < length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    isSorted = false;
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//
//            if (isSorted) break;
//
//            System.out.printf("Loop %d: ", i + 1);
//            display(arr);
//            System.out.println();
//        }
    }

    private static void display(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) System.out.printf("%d ", arr[i]);
    }
}