package io.github.floyd.di.annotated;

import io.github.floyd.spring.helloworld.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

/**
 * simple bean
 */
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage () {
        return "Hello World";
    }
}
