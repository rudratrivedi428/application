package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");
			string getUserName(){
			return "getUserName";
			}
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String 
//comparing the digits until the number becomes 0  
while (num > 0)   are by dividing them by 10  
num = num/10;   
square = square/10;   
}   
return true;   
}   
//Driver code  beanName : beanNames) {
				System.out.println(beanName);
				System.out.println(bean.Os.getUserName());
			}

		};
	}

}
