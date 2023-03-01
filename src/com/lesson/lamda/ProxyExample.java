package com.lesson.lamda;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        Company company = new Company();
        Proxy.newProxyInstance(company.getClass().getClassLoader(), company.getClass().getInterfaces(),
                (proxy, method, args1) -> method.invoke(company, args1));
    }
}
