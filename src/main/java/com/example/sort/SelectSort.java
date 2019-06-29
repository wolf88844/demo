package com.example.sort;

/**
 * @author admin
 * @date 2019/1/15
 **/
public class SelectSort {
    public static void selectSort(int[] numbers){
        int temp = 0;
        for(int i=0;i<numbers.length;i++){
            int k = i;
            for(int j=numbers.length-1;j>i;j--){
                if(numbers[j]<numbers[k]){
                    k=j;
                }
            }
            temp=numbers[i];
            numbers[i]=numbers[k];
            numbers[k]=temp;
        }
    }
}
