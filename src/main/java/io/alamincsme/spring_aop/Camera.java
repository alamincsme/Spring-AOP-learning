package io.alamincsme.spring_aop;


import org.springframework.stereotype.Component;

@Component
public class Camera {

    public void snap() {
        System.out.println("SNAP!");
    }

    public void snap(int exposure) {
        System.out.println("SNAP With exposure : " + exposure);
    }

    public String snap(String name) {
        System.out.println("SNAP With name : " + name);
        return name;
    }

    public void snapNightTime () {
        System.out.println("SNAP! Night mode.");
    }
}
