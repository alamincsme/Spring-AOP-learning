package io.alamincsme.spring_aop;


import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerInfo {




   Logger logger = LoggerFactory.getLogger("LoggerInfo");

//    @Pointcut ("execution( * io.alamincsme.spring_aop.Camera+.*(..))")
//    public void cameraSnap(){
//
//    }

//    @Pointcut("execution(* io.alamincsme.spring_aop.Lense+.*(..))")
//    public void zoom () {
//
//    }


//   @Before("cameraSnap() || zoom()")
//    public void aboutToTakePhoto() {
//        System.out.println("About to take photo ........");
//    }

//    @Pointcut("execution(* io.alamincsme.spring_aop.Camera+.*(..))")
//    public void cameraActivity() {
//
//    }

//    @Before("cameraActivity()")
//    public void cameraRelatedActivity() {
//        System.out.println("doing something related to camera ....");
//    }


 //another section

    @Pointcut ("execution( * io.alamincsme.spring_aop.Camera+.*(..))")
    public void cameraSnap(){

    }


   @Before("cameraSnap() ")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo ........");
    }

    @After("cameraSnap()")
    public void afterAdvice () {
     System.out.println("after advice .........");
    }

    @AfterReturning("cameraSnap()")
    public void afterReturning() {
        System.out.println("after returning advice ........");
    }
}
