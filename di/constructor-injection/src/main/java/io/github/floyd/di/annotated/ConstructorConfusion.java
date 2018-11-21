package io.github.floyd.di.annotated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author manhattan
 */
@Service("constructorConfusion")
public class ConstructorConfusion {
    private String someValue;
    private static final Logger LOGGER = LoggerFactory.getLogger(ConstructorConfusion.class);

    public ConstructorConfusion(String someValue) {
        LOGGER.debug("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    @SuppressWarnings("SpringJavaAutowiredMembersInspection")
    @Autowired
    public ConstructorConfusion(@Value("90") int someValue) {
        LOGGER.debug("ConstructorConfusion(int) called");
        this.someValue = "Number:" + Integer.toString(someValue);
    }

    @Override
    public String toString() {
        return someValue;
    }

    public static void main(String... args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("classpath:spring/app-context-annotation.xml");
        genericXmlApplicationContext.refresh();

        ConstructorConfusion constructorConfusion = genericXmlApplicationContext.getBean("constructorConfusion", ConstructorConfusion.class);
        LOGGER.debug("ConstructorConfusion: {}", constructorConfusion);
        genericXmlApplicationContext.close();
    }
}
