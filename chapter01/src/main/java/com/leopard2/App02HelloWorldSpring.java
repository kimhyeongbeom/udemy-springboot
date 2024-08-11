package com.leopard2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch a Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Configure the things that we want Spring to manage
        // HelloWorldConfiguration - @Configuration
        // name - @Bean

        // 3. Retrieving beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3ParameterCall"));
        System.out.println(context.getBean("address2"));
        //System.out.println(context.getBean(Address.class));

        for ( String beanName : context.getBeanDefinitionNames() ) {
            System.out.println(beanName);
        }
        System.out.println("=====================================");
        Arrays.stream(context.getBeanDefinitionNames()).map(s -> s+">>>").forEach(System.out::println);
    }
}
