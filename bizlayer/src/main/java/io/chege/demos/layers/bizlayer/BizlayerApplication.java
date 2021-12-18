package io.chege.demos.layers.bizlayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BizlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizlayerApplication.class, args);
	}

}
