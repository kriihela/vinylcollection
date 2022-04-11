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
			Artist aerosmith = new Artist("Aerosmith");
			Artist aliceCooper = new Artist("Alice Cooper");
			Artist theArcs = new Artist("The Arcs");
			Artist badReligion = new Artist("Bad Religion");
			Artist beastieBoys = new Artist("Beastie Boys");
			Artist theBeatles = new Artist("The Beatles");
			Artist bigStar = new Artist("Big Star");
			Artist theBlackKeys = new Artist("The Black Keys");
			Artist blackSabbath = new Artist("Black Sabbath");
			Artist theClash = new Artist("The Clash");
			Artist ccr = new Artist("Creedence Clearwater Revival");
			Artist daftPunk = new Artist("Daft Punk");
			Artist danAuerbach = new Artist("Dan Auerbach");
			Artist davidBowie = new Artist("David Bowie");
			Artist deepPurple = new Artist("Deep Purple");
			Artist theDoors = new Artist("The Doors");
			Artist dxxxaDNukkehallitus = new Artist("Dxxxa D & Nukkehallitus");
			Artist entombed = new Artist("Entombed");
			Artist hurriganes = new Artist("Hurriganes");
			
			artistRepository.save(aerosmith);
			artistRepository.save(aliceCooper);
			artistRepository.save(theArcs);
			artistRepository.save(badReligion);
			artistRepository.save(beastieBoys);
			artistRepository.save(theBeatles);
			artistRepository.save(bigStar);
			artistRepository.save(theBlackKeys);
			artistRepository.save(blackSabbath);
			artistRepository.save(theClash);
			artistRepository.save(ccr);
			artistRepository.save(daftPunk);
			artistRepository.save(danAuerbach);
			artistRepository.save(davidBowie);
			artistRepository.save(deepPurple);
			artistRepository.save(theDoors);
			artistRepository.save(dxxxaDNukkehallitus);
			artistRepository.save(entombed);
			artistRepository.save(hurriganes);
			
			log.info("save records");
			Vinyl rocks = new Vinyl("Rocks", aerosmith, 1976, "Rock", "12-inch", "-");
			Vinyl killer = new Vinyl("Killer", aliceCooper, 1971, "Rock", "12-inch", "-");
			Vinyl theBreadcrumbs = new Vinyl("The Breadcrumbs", aliceCooper, 2019, "Rock", "10-inch", "Numbered limited edition");
			Vinyl yoursDreamily = new Vinyl("Yours, Dreamily,", theArcs, 2015, "Rock", "12-inch", "-");
			Vinyl ageOfUnreason = new Vinyl("Age Of Unreason", badReligion, 2019, "Punk", "12-inch", "-");
			Vinyl licensedToIll = new Vinyl("Licensed to Ill", beastieBoys, 1986, "Hip hop", "12-inch", "-");
			Vinyl abbeyRoad = new Vinyl("Abbey Road", theBeatles, 1969, "Rock", "12-inch", "-");
			Vinyl letItBe = new Vinyl("Let It Be", theBeatles, 1970, "Rock", "12-inch", "-");
			Vinyl revolver = new Vinyl("Revolver", theBeatles, 1966, "Rock", "12-inch", "Mono mix");
			Vinyl rubberSoul = new Vinyl("Rubber Soul", theBeatles, 1965, "Rock", "12-inch", "Mono mix");
			Vinyl theSinglesCollection = new Vinyl("The Singles Collection", theBeatles, 2019, "Rock", "Box set", "23 x 7-inch");
			Vinyl radioCity = new Vinyl("Radio City", bigStar, 1974, "Rock", "12-inch", "Mono mix");
			Vinyl brothers = new Vinyl("Brothers", theBlackKeys, 2010, "Rock", "12-inch", "2 x LP");
			Vinyl letsRock = new Vinyl("Let's Rock", theBlackKeys, 2019, "Rock", "12-inch", "-");
			Vinyl thevinylcollection = new Vinyl("The Vinyl Collection 1970 - 1978", blackSabbath, 2019, "Rock", "Box set", "9 x 12-inch + 7-inch");
			Vinyl londonCalling = new Vinyl("London Calling", theClash, 1979, "Punk", "12-inch", "-");
			Vinyl cosmosFactory = new Vinyl("Cosmo's Factory", ccr, 1970, "Rock", "12-inch", "-");
			Vinyl greenRiver = new Vinyl("Green River", ccr, 1969, "Rock", "12-inch", "-");
			Vinyl alive1997 = new Vinyl("Alive 1997", daftPunk, 2001, "Dance", "12-inch", "-");
			Vinyl waitingOnASong = new Vinyl("Waiting On A Song", danAuerbach, 2017, "Rock", "12-inch", "-");
			Vinyl aladdinSane = new Vinyl("Aladdin Sane", davidBowie, 1973, "Rock", "12-inch", "-");
			Vinyl ziggyStardust = new Vinyl("The Rise And Fall Of Ziggy Stardust And The Spiders From Mars", davidBowie, 1972, "Rock", "12-inch", "-");
			Vinyl burn = new Vinyl("Burn", deepPurple, 1974, "Rock", "12-inch", "-");
			Vinyl inRock = new Vinyl("Deep Purple In Rock", deepPurple, 1970, "Rock", "12-inch", "-");
			Vinyl fireball = new Vinyl("Fireball", deepPurple, 1971, "Rock", "12-inch", "-");
			Vinyl absolutelyLive = new Vinyl("Absolutely Live", theDoors, 1970, "Rock", "12-inch", "2 x LP");
			Vinyl strangeDays = new Vinyl("Strange Days", theDoors, 1967, "Psychedelic Rock", "12-inch", "Mono mix");
			Vinyl theDoorsSelfTitled = new Vinyl("The Doors", theDoors, 1967, "Psychedelic Rock", "12-inch", "Mono mix");
			Vinyl maaan = new Vinyl("Määän", dxxxaDNukkehallitus, 2017, "Avant-garde", "12-inch", "Craziest shit I've got");
			Vinyl wolverineBlues = new Vinyl("Wolverine Blues", entombed, 1993, "Death Metal", "12-inch", "-");
			Vinyl crazyDays = new Vinyl("Crazy Days", hurriganes, 1975, "Rock", "12-inch", "-");
		
			vinylRepository.save(rocks);
			vinylRepository.save(killer);
			vinylRepository.save(theBreadcrumbs);
			vinylRepository.save(yoursDreamily);
			vinylRepository.save(ageOfUnreason);
			vinylRepository.save(licensedToIll);
			vinylRepository.save(abbeyRoad);
			vinylRepository.save(letItBe);
			vinylRepository.save(revolver);
			vinylRepository.save(rubberSoul);
			vinylRepository.save(theSinglesCollection);
			vinylRepository.save(radioCity);
			vinylRepository.save(brothers);
			vinylRepository.save(letsRock);
			vinylRepository.save(thevinylcollection);
			vinylRepository.save(londonCalling);
			vinylRepository.save(cosmosFactory);
			vinylRepository.save(greenRiver);
			vinylRepository.save(alive1997);
			vinylRepository.save(waitingOnASong);
			vinylRepository.save(aladdinSane);
			vinylRepository.save(ziggyStardust);
			vinylRepository.save(burn);
			vinylRepository.save(inRock);
			vinylRepository.save(fireball);
			vinylRepository.save(absolutelyLive);
			vinylRepository.save(strangeDays);
			vinylRepository.save(theDoorsSelfTitled);
			vinylRepository.save(maaan);
			vinylRepository.save(wolverineBlues);
			vinylRepository.save(crazyDays);
		
			User user = new User("admin", "$2a$10$XBS.2lf8thYKQbdombpI6u1bwgAyoAGMyLFij8jC1.vzofJ7Ccxli", "ADMIN");
		
			userRepository.save(user);
		
		
		
		log.info("fetch all vinyls");
		for (Vinyl vinyl : vinylRepository.findAll()) {
			log.info(vinyl.toString());
		}
		
		};
	}
}

