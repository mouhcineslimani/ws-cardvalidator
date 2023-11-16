package org.mql.ws.restws;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CardValidatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
	    new CardValidatorApplication().configure(new SpringApplicationBuilder(CardValidatorApplication.class)).run(args);
	}

}