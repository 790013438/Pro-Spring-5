package io.github.floyd.di;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

    public static void main(String... args) {
        DefaultListableBeanFactory defaultlistablebeanfactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlbeandefinitionreader = new XmlBeanDefinitionReader(defaultlistablebeanfactory);
        xmlbeandefinitionreader.loadBeanDefinitions(new ClassPathResource("spring/xml-bean-factory-config.xml"));
        Oracle oracle = (Oracle)defaultlistablebeanfactory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
