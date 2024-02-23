package io.alamincsme.spring_aop;

import org.springframework.stereotype.Component;

@Component
public class Lense {

    public void zoom(int factor) {
        System.out.println("Zoom in lense in factor : " + factor);
    }
}
