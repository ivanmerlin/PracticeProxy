package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    private Object obj;
    public MyProxy(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before");
        
        System.out.println("method="+method);
        method.invoke(obj, args);
        
        System.out.println("after");
        
        return null;
    }
    
}
