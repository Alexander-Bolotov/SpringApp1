package ru.bolotov.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean("helloWorldBean")
    public HelloWorld doHelloWorld(){
        return new HelloWorld();
    }
    @Bean("catBean")
    @Scope("prototype")
    public Cat makeCat (){
        return new Cat();
    }
}
