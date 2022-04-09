package com.example.vinyylilista.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long artistId;
	private String artistName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "artist")
	@JsonIgnoreProperties("artist")
	private List<Vinyl> vinyls;
	
	public List<Vinyl> getVinyls() {
		return vinyls;
	}

	public void setVinyls(List<Vinyl> vinyls) {
		this.vinyls = vinyls;
	}

	public Artist() {}
	
	public Artist(String artistName) {
		super();
		this.artistName = artistName;
	}

	public Long getArtistId() {
		return artistId;
	}

	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + "]";
	}

}
