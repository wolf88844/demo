package com.example.proxy;

/**
 * @author admin
 * @date 2019/1/5
 **/
public class HelloManager implements IHello {
    @Override
    public void say(String name) {
        System.out.println("hello,"+name);
    }
}
