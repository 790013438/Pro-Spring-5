package io.github.floyd.spring.helloworld.decoupled;

/**
 * @author floyd
 */
public class NotInitializedException extends RuntimeException {
    NotInitializedException(String name) {
        super(name);
    }

    NotInitializedException() {
        super();
    }
}

