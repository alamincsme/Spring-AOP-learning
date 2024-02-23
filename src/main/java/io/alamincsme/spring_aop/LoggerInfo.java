package io.alamincsme.spring_aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerInfo {


    @Pointcut ("execution(public void snap())")
    public void cameraSnap(){

    }

   Logger logger = LoggerFactory.getLogger("LoggerInfo");

   @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo ........");
    }
}
