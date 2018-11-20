package io.github.floyd.spring.helloworld.annotated;

import io.github.floyd.spring.helloworld.decoupled.HelloWorldMessageProvider;
import io.github.floyd.spring.helloworld.decoupled.MessageProvider;
import io.github.floyd.spring.helloworld.decoupled.MessageRenderer;
import io.github.floyd.spring.helloworld.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 程淼
 * @version 1.0
 * ClassName io.github.floyd.spring.helloworld.annotated
 * Description: 描述
 * Company: com.yinhai
 * date 2018/11/20
 */
@Configuration
public class HelloWorldConfiguration {

    /**
     * equivalent to <bean id="provider" class="..">
     */
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    /**
     * equivalent to <bean id="renderer" class="..">
     */
    @Bean
    public MessageRenderer renderer() {
        MessageRenderer render = new StandardOutMessageRenderer();
        render.setMessageProvider(provider());
        return render;
    }
}
