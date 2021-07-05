package io.github.floyd.di;

import io.github.floyd.abstra.Person;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

public class XmlConfigWithBeanFactory {

    public static void main(String... args) {
        DefaultListableBeanFactory defaultlistablebeanfactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlbeandefinitionreader = new XmlBeanDefinitionReader(defaultlistablebeanfactory);
        xmlbeandefinitionreader.loadBeanDefinitions(new ClassPathResource("spring/xml-bean-factory-config.xml"));
        Oracle oracle = (Oracle)defaultlistablebeanfactory.getBean("oracle");
        Oracle oracle2 = (Oracle)defaultlistablebeanfactory.getBean("oracle");
        System.out.println(oracle == oracle2);
        System.out.println(oracle.defineMeaningOfLife());

        Person worker = (Person) defaultlistablebeanfactory.getBean("worker");
        worker.get();
        Person worker0x0 = (Person) defaultlistablebeanfactory.getBean("worker0x0");
        worker0x0.get();

        worker.get();
//        System.out.println(worker0x0);
//        System.out.println(worker);
//        System.out.println(worker0x0 == worker);

        List a = (List) defaultlistablebeanfactory.getBean("paths");
        System.out.println(a);

        Person worker0x1 = (Person) defaultlistablebeanfactory.getBean("worker0x1");
        worker0x1.get();

        System.out.println("xxxcom.yinhai.hai".replaceAll("(<.*>)*com.yinhai.*", ""));
    }
}
