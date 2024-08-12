package com.leopard2.game5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Scope(value = "prototype")
@Component
class ProtoTypeClass{

}


@Configuration
@ComponentScan
public class BeanScopeApplication {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanScopeApplication.class)) {
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("normal class:" + context.getBean(NormalClass.class));
            System.out.println("normal class:" + context.getBean(NormalClass.class));
            System.out.println("normal class:" + context.getBean(NormalClass.class));
            System.out.println("prototype class:" + context.getBean(ProtoTypeClass.class));
            System.out.println("prototype class:" + context.getBean(ProtoTypeClass.class));
            System.out.println("prototype class:" + context.getBean(ProtoTypeClass.class));

        }
    }
}