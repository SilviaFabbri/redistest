package it.sinapsi.redistest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RedistestApplication {

	public static void main(String[] args) {

	SpringApplication.run(RedistestApplication.class, args);
	}

}
