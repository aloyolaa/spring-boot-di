package com.aloyolaa.springbootdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("myService2")
public class MyService2 implements IService {

    @Override
    public String operation() {
        return "Executing a hard process";
    }

}
