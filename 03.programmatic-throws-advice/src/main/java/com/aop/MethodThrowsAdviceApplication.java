package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.Movie;
import com.aop.bo.MovieService;


@SpringBootApplication
public class MethodThrowsAdviceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MethodThrowsAdviceApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Movie movie = context.getBean("movie", Movie.class);
		
		MovieService movieService = (MovieService) context.getBean("proxy");
		movieService.playMovie(movie);
		
	}

}
