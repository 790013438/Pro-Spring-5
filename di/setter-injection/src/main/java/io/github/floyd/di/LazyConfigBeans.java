package io.github.floyd.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class LazyConfigBeans {
    public static void main (String...args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("classpath:spring/app-context-lazy-xml.xml");
    }
}
