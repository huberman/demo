package com.transformuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
    @RestController
    static class Bootjava8Controller {
        @RequestMapping("/")
        public ResponseEntity<String> bootjava8() {
            return ResponseEntity.ok("I'm running on Java 8, honestly...");
        }

    }
    
//    @Bean
//    public CommandLineRunner demo(TestDataRepository repo) {
//    	return (args) -> {
//            repo.save(new TestData(4, 5));
//            repo.save(new TestData(6, 7));
//    		for (TestData td : repo.findAll()) {
//    			System.out.println("TestData => " + td);
//    		}
//    	};
//    }
}
