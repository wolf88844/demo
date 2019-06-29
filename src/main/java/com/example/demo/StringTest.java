package com.example.demo;

/**
 * @author admin
 * @date 2017/11/29
 **/
public class StringTest {
    public static void main(String[] args){
        String a;
        String b;
        a=b="1";
        String a1="水电费";
        String a2=a1;
        String a3=new String(a1);
        System.out.println(a==b);
        System.out.println(a1==a2);
        System.out.println(a1==a3);

    }
}
