package com.example.sort;

/**
 * @author admin
 * @date 2019/1/15
 **/
public class QuickSort {

    private static int getMiddle(int[] numbers,int low,int hight){
        int temp = numbers[low];
        while (low<hight){
            while (low<hight&&numbers[hight]>temp){
                hight--;
            }
            numbers[low]=numbers[hight];
            while (low<hight&&numbers[low]<temp){
                low++;
            }
            numbers[hight]=numbers[low];
        }
        numbers[low]=temp;
        return low;
    }

    private static void quitSort(int[] numbers,int low,int high){
        if(low<high){
            int middle = getMiddle(numbers, low, high);
            quitSort(numbers,low,middle-1);
            quitSort(numbers,middle+1,high);
        }
    }

    public static  void quick(int[] numbers){
        if(numbers.length>0){
            quitSort(numbers,0,numbers.length-1);
        }
    }
}
