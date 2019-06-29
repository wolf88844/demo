package com.example.sort;

import java.util.HashSet;
import java.util.Set;

/**
 * @author admin
 * @date 2019/1/15
 **/
public class SortTest {

    public static void main(String[] args){
        int[] numbers = getNumbers(20);
        long b = System.currentTimeMillis();
        BubbleSort.bubbleSort(numbers);
        showNumber(numbers,b);

        long b1 = System.currentTimeMillis();
        QuickSort.quick(numbers);
        showNumber(numbers,b1);

        long b2 = System.currentTimeMillis();
        SelectSort.selectSort(numbers);
        showNumber(numbers,b2);


        for (int i = 1,j=1; j < 10; i++) {
            System.out.print(j+"*"+i+"="+i*j+" ");
            if(i==j){
                i=0;
                j++;
                System.out.println();
            }
        }


        String a="b";
        for(int i=0;i<1000;i++){
            a+=i;
        }
        System.out.println(a);
    }


    private static int[] getNumbers(int count){
        Set<Integer> nums = new HashSet<>();
        int[] numbers = new int[count];
        for(int i=0;i<count;i++){
            int random  = (int) (Math.random() * (10*(Math.random()*10)));
            if(nums.add(random)){
                numbers[i]=random;
            }else{
                i--;
            }
        }
        return numbers;
    }

    private static void showNumber(int[] numbers,long beginTime){
        for (int i = 0; i <numbers.length ; i++) {
            if(i==numbers.length-1){
                System.out.println(numbers[i]);
            }else {
                System.out.print(numbers[i] + ",");
            }
        }
        System.out.println("耗时："+(System.currentTimeMillis()-beginTime)+"ms");
    }
}
