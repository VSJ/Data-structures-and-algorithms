package com.vishal.datastructures;

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
            int mid = (start + end) / 2;
            MergeSort(arr,start,mid-1);
            MergeSort(arr,mid,end);
            Merge(arr);
        }
    }
    static private void Merge(int[] arr) {

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
