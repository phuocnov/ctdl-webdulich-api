package webdulich.webdulich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import webdulich.webdulich.role.RoleRepository;
import webdulich.webdulich.role.Role;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class WebdulichApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(WebdulichApplication.class, args);
	}

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {
	}
}
