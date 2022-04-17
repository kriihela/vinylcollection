package com.example.vinyylilista;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.example.vinyylilista.domain.Artist;
import com.example.vinyylilista.domain.ArtistRepository;
import com.example.vinyylilista.domain.User;
import com.example.vinyylilista.domain.UserRepository;
import com.example.vinyylilista.domain.Vinyl;
import com.example.vinyylilista.domain.VinylRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class VinyylilistaRepositoryTests {
	
	@Autowired
	private ArtistRepository artistRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private VinylRepository vinylRepository;
	
	@Test
	public void artistTests() {
		//save
		Artist artist = new Artist("Test");
		artistRepository.save(artist);
		assertThat(artist.getArtistId()).isNotNull();
		//find
		List<Artist> artists = artistRepository.findByArtistName("Test");
		assertThat(artists.get(0).getArtistName()).isEqualTo("Test");
		//delete
		artistRepository.delete(artist);
		assertThat(artistRepository.findById(artist.getArtistId())).isEmpty();
	}
	@Test
	public void userTests() {
		//save
		User user = new User("user", "user123", "USER");
		userRepository.save(user);
		assertThat(user.getId()).isNotNull();
		//find
		User users = userRepository.findByUsername("user");
		assertThat(users.getUsername()).isEqualTo("user");
		//delete
		userRepository.delete(user);
		assertThat(userRepository.findById(user.getId())).isEmpty();
	}
	@Test
	public void vinylTests() {
		//save
		Vinyl vinyl = new Vinyl("Album", artistRepository.findByArtistName("Entombed").get(0), 666, "plaaplaa", "jeejee", "jabadabaduu");
		vinylRepository.save(vinyl);
		assertThat(vinyl.getVinylId()).isNotNull();
		//find
		List<Vinyl> vinyls = vinylRepository.findByVinylName("Album");
		assertThat(vinyls.get(0).getVinylName()).isEqualTo("Album");
		//delete
		vinylRepository.delete(vinyl);
		assertThat(vinylRepository.findById(vinyl.getVinylId())).isEmpty();
	}

}
