package ebspeedsystem.ebspeedsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EbspeedsystemApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context=SpringApplication.run(EbspeedsystemApplication.class, args);
		
		
		Allen a=context.getBean(Allen.class);
		a.show();
	}

} 
