package br.com.chromatox.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "br.com.chromatox")
public class ChromatoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChromatoxApplication.class, args);
	}
}
