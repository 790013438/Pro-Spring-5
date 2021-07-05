package io.github.floyd.di;

import io.github.floyd.spring.helloworld.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author 程淼
 * @version 1.0
 * ClassName io.github.floyd.di
 * Description: 描述
 * Company: com.yinhai
 * date 2018/11/21
 */
public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("classpath:spring/app-context-annotation.xml");
        genericXmlApplicationContext.refresh();
        MessageRenderer messageRenderer = genericXmlApplicationContext.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
        MessageRenderer messageRenderer2 = genericXmlApplicationContext.getBean("renderer", MessageRenderer.class);
        messageRenderer2.render();
        genericXmlApplicationContext.close();
        System.out.println(messageRenderer == messageRenderer2);
    }
}
