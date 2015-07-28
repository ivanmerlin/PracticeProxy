package impl;

import interfaces.HelloInterface;

public class HelloImpl implements HelloInterface{

    @Override
    public void sayHello(String name) {
        // TODO Auto-generated method stub
        System.out.println("hello user "+name);
    }

}
