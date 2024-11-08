package com.idimis.montrack;

import com.idimis.montrack.config.RsaKeyConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({RsaKeyConfigProperties.class})
public class MontrackApplication {


	public static void main(String[] args) {

		SpringApplication.run(MontrackApplication.class, args);
		System.out.println("Hello... every nyam ");
	}

}
