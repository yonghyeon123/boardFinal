package com.aia.boardFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:db.properties")
@SpringBootApplication
public class BoardFinalApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(BoardFinalApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BoardFinalApplication.class, args);
	}

}
