package webdulich.webdulich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.SingletonManager;
import com.cloudinary.utils.ObjectUtils;

import webdulich.webdulich.role.RoleRepository;
import webdulich.webdulich.role.Role;

@SpringBootApplication
public class WebdulichApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(WebdulichApplication.class, args);

		// Set Cloudinary instance
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "djisjt7tv",
				"api_key", "624532335189656",
				"api_secret", "wDaFKsBECbagjwKslClhStyUZxs"));
		SingletonManager manager = new SingletonManager();
		manager.setCloudinary(cloudinary);
		manager.init();
	}

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {

		Role adminRole = new Role();
		adminRole.setName("ROLE_ADMIN");
		roleRepository.save(adminRole);

		Role userRole = new Role();
		userRole.setName("ROLE_USER");
		roleRepository.save(userRole);
	}
}
