package ru.basicspring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
 
    @Bean(name = "something")
    public Something getSomething () {
    	return new Something(getInnerSomething());
    }
    
    @Bean(name = "inner_something")
    public InnerSomething getInnerSomething() {
    	return new InnerSomething();
    }

}