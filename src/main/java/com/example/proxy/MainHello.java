package com.example.proxy;

/**
 * @author admin
 * @date 2019/1/5
 **/
public class MainHello {
    public static void main(String[] args){
        HelloManager helloManager = new HelloManager();
        helloManager.say("Joson");

        IHello helloManager1 = (IHello)new ProxyHello().bind(new HelloManager());
        helloManager1.say("Lily");


    }

    public static long factorial(Integer num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

}
