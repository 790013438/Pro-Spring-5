package io.github.floyd.spring.helloworld.decoupled;

/**
 * @author floyd
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
