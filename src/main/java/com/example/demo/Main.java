package com.example.demo;


import java.io.IOException;
import java.util.Scanner;


/**
 * @author admin
 * @date 2017/11/27
 **/
public class Main {
    static String[] number = null;
    public static void main(String[] args) throws IOException
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Scanner x=new Scanner(System.in);
        String xstr = x.nextLine();
        number = xstr.split(" ");

        quitScort(0,a-1);
        System.out.println(a);
        System.out.print(number[0]);
        System.out.print(" ");
        for(int j=1;j<a;j++){
            if(number[j]!=number[j-1]){
                System.out.print(number[j]);
                System.out.print(" ");
            }
        }

    }

    public static void quitScort(Integer left,Integer right){
        Integer i,j,t,temp;
        if(left>right){
            return;
        }
        temp = Integer.parseInt(number[left]);
        i=left;
        j=right;
        while(i!=j){
            while(Integer.parseInt(number[j])>temp&&i<j){
                j--;
            }
            while(Integer.parseInt(number[i])<temp && i<j){
                i++;
            }
            if(i<j){
                t=Integer.parseInt(number[i]);
                number[i]=number[j];
                number[j]=t.toString();
            }
        }

        number[left]=number[i];
        number[i]=temp.toString();

        quitScort(left,i-1);
        quitScort(i+1,right);
        return;
    }
}
