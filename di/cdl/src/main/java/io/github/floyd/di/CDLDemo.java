package io.github.floyd.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDLDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(CDLDemo.class);

    public static void main(String... args) {
        Container container = new DefaultContainer();

        ManagedComponent managedComponent = new ContextualizedDependencyLookup();
        managedComponent.performLookup(container);

        LOGGER.debug("运行结果:{}", managedComponent);
    }
}
