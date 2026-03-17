package com.natancode;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SomeBean {

    public void hello() {
        System.out.println("Hello");
    }

}
