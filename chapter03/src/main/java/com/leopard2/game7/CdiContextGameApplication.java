package com.leopard2.game7;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Component
@Named
class DataSource {

}

//@Component
@Named
class BusinessService {
    private DataSource dataSource;

    //@Autowired
    @Inject
    public void setDataSource(DataSource dataSource) {
        System.out.println("setDataSource");
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}

@Configuration
@ComponentScan
public class CdiContextGameApplication {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CdiContextGameApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("---------------------------");
            System.out.println(context.getBean(BusinessService.class).getDataSource());
        }
    }
}