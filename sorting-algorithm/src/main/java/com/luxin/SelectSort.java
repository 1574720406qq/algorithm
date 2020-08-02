package com.luxin;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 12:50 上午 2020/8/2
 * @Modified By:
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            //假定最小值为0位置上的数
            int minIndex = i;
            //遍历[1,arr.leng - 1]位置上的数
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
