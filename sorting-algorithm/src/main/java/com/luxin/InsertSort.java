package com.luxin;

import java.util.Arrays;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 11:09 上午 2020/8/2
 * @Modified By:
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr.length < 2 || arr == null) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //随机生成一个数组
    public static int[] generateRandomArray(int size, int value) {
        //生成长度随机的数组长度在[0,size]
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            //生成随机数字
            arr[i] = (int) ((value + 1) * Math.random()) - (int) (value * Math.random());
        }
        return arr;
    }

    public static void rightMethod(int[] arr) {
        Arrays.sort(arr);
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int testTime = 5000000;
        int size = 10;
        int value = 100;
        boolean succeed = true;
        int[] arr1 = null;
        int[] arr2 = null;
        int[] arr3 = null;
        for (int i = 0; i < testTime; i++) {
            arr1 = generateRandomArray(size, value);
            arr2 = copyArray(arr1);
            arr3 = copyArray(arr1);
            insertSort(arr1);
            rightMethod(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                //错误时打印出错的样本
                printArray(arr3);
                break;
            }
        }
        System.out.println(succeed ? "nice" : "Fucking fucked!");
        int[] array = generateRandomArray(size, value);
        printArray(array);
        System.out.println("======");
        printArray(arr1);
        insertSort(array);
        printArray(array);
    }

    private static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    private static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
