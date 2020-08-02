package com.luxin;

import java.util.Arrays;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 2:09 下午 2020/8/2
 * @Modified By:
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 2, 4, 133, 2344, 65, 53, 2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        sortProcess(0, arr.length - 1, arr);
    }

    public static void sortProcess(int l, int r, int[] arr) {
        //注意递归的退出条件
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        sortProcess(l, mid, arr);
        sortProcess(mid + 1, r, arr);
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int p1 = l;
        int p2 = mid + 1;
        int i = 0;
        while (p1 <= mid && p2 <= r) {
            help[i++] = arr[p1] > arr[p2] ? arr[p2++] : arr[p1++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }

    }
}

class SmallSum {
    public static int smallSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return mergeSum(arr, 0, arr.length - 1);
    }

    public static int mergeSum(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = l + ((r - l) >> 1);
        return mergeSum(arr, l, mid)
                + mergeSum(arr, mid + 1, r)
                + merge(arr, l, r, mid);

    }

    private static int merge(int[] arr, int l, int r, int mid) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = 0;
        int p2 = mid + 1;
        int res = 0;
        while (p1 <= mid && p2 <= r) {
            res = arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < arr.length; i++) {
            arr[l + i] = help[i];
        }
        return res;
    }

}