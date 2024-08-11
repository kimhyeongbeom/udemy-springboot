package com.leopard2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) {}
record Address(String steet, String city) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Leopard2";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person() {
        return new Person("tiger", 20, new Address("Jongro St.", "Seoul"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3ParameterCall(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name="address2")
    public Address address() {
        return new Address("Baker St.", "London");
    }

    @Qualifier("address3")
    @Bean(name="address3")
    public Address address3() {
        return new Address("Main St.", "Busan");
    }
}
