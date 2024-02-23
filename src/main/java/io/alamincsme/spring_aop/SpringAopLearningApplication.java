package io.alamincsme.spring_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopLearningApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringAopLearningApplication.class, args);
		Camera camera = context.getBean(Camera.class);
		camera.snap();
		camera.snap(1000);
		camera.snap("Perliament House");
		camera.snapNightTime();

		Lense lense = context.getBean(Lense.class);
		lense.zoom(10);

		
	}

}
