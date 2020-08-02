package com.luxin;

import java.util.Arrays;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 3:41 下午 2020/8/2
 * @Modified By:
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,24,343,5,45,23,12};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2){
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr,R,L + (int)(Math.random() * (R-L+1)));
            int[] partition = partition(arr, L, R);
            quickSort(arr, L, partition[0] - 1);
            quickSort(arr, partition[1] + 1, R);
        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr,L,--more);
            } else {
                L ++;
               // swap(arr, --more, L);
            }
        }
        swap(arr, more, R);
        return new int[]{less + 1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}