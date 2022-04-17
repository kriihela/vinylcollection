package com.example.vinyylilista;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.vinyylilista.web.ArtistController;
import com.example.vinyylilista.web.VinylController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class VinyylilistaApplicationTests {

	@Autowired
	private ArtistController artistController;
	
	@Autowired
	private VinylController vinylController;

	@Test
	public void contextLoads() throws Exception {
		
		assertThat(artistController).isNotNull();
		assertThat(vinylController).isNotNull();
	}

}
