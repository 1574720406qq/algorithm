package com.luxin;

import java.util.Arrays;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 11:54 下午 2020/8/1
 * @Modified By:
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,6,3,45,34};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for (int end = arr.length - 1; end > 0 ; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
