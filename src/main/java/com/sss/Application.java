
package com.sss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

//@SpringBootApplication
//public class Application{
//	public static void main(String[] args){
//		System.out.println(Application.class);
//		SpringApplication.run(Application.class, args);
//	}
//}

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
    	System.out.println(Application.class);
        SpringApplication.run(Application.class, args);
    }
}
