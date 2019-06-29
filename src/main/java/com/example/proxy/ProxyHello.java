package com.example.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author admin
 * @date 2019/1/5
 **/
public class ProxyHello implements InvocationHandler {
    private Object res;
    public Object bind(Object object){
        this.res = object;
        return Proxy.newProxyInstance(this.res.getClass().getClassLoader(),this.res.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        LogHelper.begin();
        Object o1 = method.invoke(this.res, objects);
        LogHelper.end();
        return o1;
    }
}
