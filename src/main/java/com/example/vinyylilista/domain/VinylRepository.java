package com.example.vinyylilista.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VinylRepository extends CrudRepository<Vinyl, Long> {
	
	List<Vinyl> findByVinylName(String vinylName);
	List<Vinyl> findByVinylNameIgnoreCase(String vinylName);
	List<Vinyl> findByVinylNameOrderByVinylNameAsc(String vinylName);

}
