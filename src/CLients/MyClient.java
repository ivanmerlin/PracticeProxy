package CLients;

import impl.HelloImpl;
import interfaces.HelloInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.MyProxy;

public class MyClient {

    
    public static void main(String[] args) {
        HelloInterface hi=new HelloImpl();
        InvocationHandler handler=new MyProxy(hi);
        
        HelloInterface h=(HelloInterface) Proxy.newProxyInstance(handler.getClass().getClassLoader() ,hi.getClass().getInterfaces() , handler);
        System.out.println(hi.getClass().getName());
        
        h.sayHello("hello");
        
    }
    
    
    
    
}
