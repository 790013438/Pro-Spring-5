package io.github.floyd.spring.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author floyd
 */
public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String... args) {
        if (args.length > 0) {
            logger.debug(args[0]);
        } else {
            logger.debug("Hello World!");
        }
    }
}
