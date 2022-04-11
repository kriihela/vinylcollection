package com.example.vinyylilista;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.vinyylilista.domain.Artist;
import com.example.vinyylilista.domain.ArtistRepository;
import com.example.vinyylilista.domain.User;
import com.example.vinyylilista.domain.UserRepository;
import com.example.vinyylilista.domain.Vinyl;
import com.example.vinyylilista.domain.VinylRepository;

@SpringBootApplication
public class VinyylilistaApplication {
	private static final Logger log = LoggerFactory.getLogger(VinyylilistaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(VinyylilistaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(VinylRepository vinylRepository, ArtistRepository artistRepository, UserRepository userRepository) {
		return (args) -> {
			log.info("save artists");
			Artist a1 = new Artist("aaa");
			Artist a2 = new Artist("bbb");
			
			artistRepository.save(a1);
			artistRepository.save(a2);
			
			log.info("save records");

			Vinyl v1 = new Vinyl("record", a1, 1990, "genre", "format", "details");
			Vinyl v2 = new Vinyl("ardfgfdg", a1, 1990, "gefgfdgnre", "fdfgormat", "dedfgdfgtails");
		
			vinylRepository.save(v1);
			vinylRepository.save(v2);
		
			User user = new User("admin", "$2a$10$XBS.2lf8thYKQbdombpI6u1bwgAyoAGMyLFij8jC1.vzofJ7Ccxli", "ADMIN");
		
			userRepository.save(user);
		
		
		
		log.info("fetch all vinyls");
		for (Vinyl vinyl : vinylRepository.findAll()) {
			log.info(vinyl.toString());
		}
		
		};
	}
}

