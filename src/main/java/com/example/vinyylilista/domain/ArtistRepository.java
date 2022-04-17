package com.example.vinyylilista.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
	
	List<Artist> findByArtistName(String artistName);
	List<Artist> findByArtistNameIgnoreCase(String artistName);
	List<Artist> findByArtistNameOrderByArtistNameAsc(String artistName);

}
