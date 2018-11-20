package io.github.floyd.spring.helloworld;

import io.github.floyd.spring.helloworld.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDi {

    public static void main(String...args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/app-context.xml");

        MessageRenderer messageRenderer = applicationContext.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
