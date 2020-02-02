package io.github.floyd.spring.helloworld.annotated;

import io.github.floyd.spring.helloworld.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 程淼
 * @version 1.0
 * ClassName io.github.floyd.spring.helloworld.annotated
 * Description: 描述
 * Company: com.yinhai
 * date 2018/11/20
 */
public class HelloWorldSpringAnnotated {

    public static void main(String...args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer messageRenderer = applicationContext.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
