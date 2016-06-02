package com.transformuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
//    @RestController
//    static class Bootjava8Controller {
//        @RequestMapping("/")
//        public String bootjava8() {
//            return "I'm running on Java 8, whoop, yay!";
//        }
//        
//    	@Autowired
//    	private TestDataRepository testDataRepo;
//        
//    	@RequestMapping("/")
//        public ResponseEntity<String> test() {
//        	String output = "";
//    		for (TestData td : testDataRepo.findAll()) {
//    			System.out.println("TestData => " + td);
//    			output += "TestData => " + td + "\n";
//    		}
//    		return ResponseEntity.ok(output);    			
//            //return "I'm running on Java 8, whoop, yay!";
//        }
//    }
//    
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
