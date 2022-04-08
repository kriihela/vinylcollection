package com.example.vinyylilista;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.vinyylilista.domain.ArtistRepository;
import com.example.vinyylilista.domain.Vinyl;
import com.example.vinyylilista.domain.VinylRepository;

@SpringBootApplication
public class VinyylilistaApplication {
	private static final Logger log = LoggerFactory.getLogger(VinyylilistaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(VinyylilistaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(VinylRepository vinylRepository, ArtistRepository artistRepository) {
		return (args) -> {
			log.info("save a couple of records");

		Vinyl v1 = new Vinyl("record", "artist", 1990, "genre", "format", "details");
		Vinyl v2 = new Vinyl("ardfgfdg", "recorgdfgdfgd", 1990, "gefgfdgnre", "fdfgormat", "dedfgdfgtails");
		
		vinylRepository.save(v1);
		vinylRepository.save(v2);
		
		log.info("fetch all vinyls");
		for (Vinyl vinyl : vinylRepository.findAll()) {
			log.info(vinyl.toString());
		}
		
		};
	}
}

