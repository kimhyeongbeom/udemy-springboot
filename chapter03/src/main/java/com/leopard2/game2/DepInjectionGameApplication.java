package com.leopard2.game2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
    final Dependency1 dependency1;
    final Dependency2 dependency2;

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    // @Autowired
    // public void setDependency1(Dependency1 dependency1) {
    //     this.dependency1 = dependency1;
    // }

    // @Autowired
    // public void setDependency2(Dependency2 dependency2) {
    //     this.dependency2 = dependency2;
    // }

    public String toString() {
        return "YourBusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
    }

}

@Component
class Dependency1{

}

@Component
class Dependency2{

}


@Configuration
@ComponentScan(basePackages = "com.leopard2.game2")
public class DepInjectionGameApplication {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DepInjectionGameApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}