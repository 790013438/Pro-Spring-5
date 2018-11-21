package io.github.floyd.di.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author manhattan
 */
public class ConstructorConfusion {
    private String someValue;
    private static final Logger LOGGER = LoggerFactory.getLogger(ConstructorConfusion.class);

    public ConstructorConfusion(String someValue) {
        LOGGER.debug("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    public ConstructorConfusion(int someValue) {
        LOGGER.debug("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    public static void main(String...args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("classpath:spring/app-context-xml.xml");
        genericXmlApplicationContext.refresh();
        ConstructorConfusion constructorConfusion = (ConstructorConfusion)genericXmlApplicationContext.getBean("constructorConfusion");
        LOGGER.debug("main：{}", constructorConfusion);
        genericXmlApplicationContext.close();
    }

    @Override
    public String toString() {
        return someValue;
    }
}
