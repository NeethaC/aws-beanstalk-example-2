package com.techprimers.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AwsElasticBeanstalkExample2Application extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AwsElasticBeanstalkExample2Application.class);
    }
	

	public static void main(String[] args) {
		SpringApplication.run(AwsElasticBeanstalkExample2Application.class, args);
	}

}
