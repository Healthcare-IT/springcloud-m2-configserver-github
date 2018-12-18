package io.github.healthcareit.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudM2ConfigserverGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM2ConfigserverGithubApplication.class, args);
	}

}

