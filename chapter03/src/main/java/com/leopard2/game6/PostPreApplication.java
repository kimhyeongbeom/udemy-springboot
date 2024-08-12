package com.leopard2.game6;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependency is ready !!");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("clean up --------");
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using dependency is ready !!");
    }

}


@Configuration
@ComponentScan
public class PostPreApplication {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PostPreApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}