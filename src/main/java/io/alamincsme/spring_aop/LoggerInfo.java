package io.alamincsme.spring_aop.camera;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerInfo {




   Logger logger = LoggerFactory.getLogger("LoggerInfo");

    @Pointcut ("execution( * io.alamincsme.spring_aop.camera.Camera+.*(..))")
    public void cameraSnap(){

    }

   @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo ........");
    }
}
