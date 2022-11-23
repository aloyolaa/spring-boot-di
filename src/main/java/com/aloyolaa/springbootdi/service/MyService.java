package com.aloyolaa.springbootdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service("myService")
public class MyService implements IService {

    @Override
    public String operation() {
        return "Executing a process";
    }

}
