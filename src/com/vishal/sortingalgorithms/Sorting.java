package com.vishal.sortingalgorithms;

/**
 * Created by vj028567 on 6/20/15.
 */
public class Sorting {
    static public void QuickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            Print(arr);
            QuickSort(arr, start, pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, end);
        }

    }
    static public void MergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;;
            MergeSort(arr,start,mid);
            MergeSort(arr,mid+1,end);
            MergeArray(arr, start, mid, end);
            Print(arr);
        }
    }
    static private void MergeArray(int[] arr, int start, int middle, int end) {
        int[] tempMergArr = new int[arr.length];
        for(int i = 0; i <= end; i++) {
            tempMergArr[i] = arr[i];
        }
        int i = start;
        int j = middle + 1;
        int k = start;
        while (i <= middle && j <= end) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                arr[k] = tempMergArr[i];
                i++;
            } else {
                arr[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
    static private int partition(int[] arr, int start, int end) {
        int pivotIndex = choosePivot(start, end);
        int pivot = arr[pivotIndex];
        int storeIndex = start;
        swap(arr, pivotIndex, end); // place the pivot at the end
        for (int i = start; i < end; i++)
            if (arr[i] < pivot ) {
              swap(arr, i, storeIndex);
                storeIndex++;
        }
        swap(arr, storeIndex, end);
        return storeIndex;
    }
    static private int choosePivot(int start,int end) {
        return (start + end) / 2;
    }
    static private void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void Print(int[] arr) {
        System.out.print("Array =>");
        for(int i=0;i<arr.length;i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
