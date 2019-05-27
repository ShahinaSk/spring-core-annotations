package com.stackroute.config;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    @Bean(name = "movie1")
    public Movie getMovie1(){

        return new Movie(101,"Kalank");
    }

    @Bean(name = "movie2")
    public Movie getMovie2(){

        return new Movie(102,"SOTY");
    }

    @Bean(name = "actor")
    public Actor getActor(){

        return new Actor("Varun","Male",30);
    }

}
