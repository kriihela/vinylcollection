package com.example.vinyylilista.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Vinyl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vinylId;
	private String vinylName;
	private String vinylArtist;
	private int vinylYear;
	private String vinylGenre;
	private String vinylFormat;
	private String vinylDetails;
	
	@ManyToOne
	@JsonIgnoreProperties("vinyls")
	@JoinColumn(name = "artistId")
	private Artist artist;
	
	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Vinyl() {}
	
	public Vinyl(String vinylName, String vinylArtist, int vinylYear, String vinylGenre,
			String vinylFormat, String vinylDetails) {
		super();
		this.vinylName = vinylName;
		this.vinylArtist = vinylArtist;
		this.vinylYear = vinylYear;
		this.vinylGenre = vinylGenre;
		this.vinylFormat = vinylFormat;
		this.vinylDetails = vinylDetails;
	}
	public Long getVinylId() {
		return vinylId;
	}
	public void setVinylId(Long vinylId) {
		this.vinylId = vinylId;
	}
	public String getVinylName() {
		return vinylName;
	}
	public void setVinylName(String vinylName) {
		this.vinylName = vinylName;
	}
	public String getVinylArtist() {
		return vinylArtist;
	}
	public void setVinylArtist(String vinylArtist) {
		this.vinylArtist = vinylArtist;
	}
	public int getVinylYear() {
		return vinylYear;
	}
	public void setVinylYear(int vinylYear) {
		this.vinylYear = vinylYear;
	}
	public String getVinylGenre() {
		return vinylGenre;
	}
	public void setVinylGenre(String vinylGenre) {
		this.vinylGenre = vinylGenre;
	}
	public String getVinylFormat() {
		return vinylFormat;
	}
	public void setVinylFormat(String vinylFormat) {
		this.vinylFormat = vinylFormat;
	}
	public String getVinylDetails() {
		return vinylDetails;
	}
	public void setVinylDetails(String vinylDetails) {
		this.vinylDetails = vinylDetails;
	}

	@Override
	public String toString() {
		return "Vinyl [vinylId=" + vinylId + ", vinylName=" + vinylName + ", vinylArtist=" + vinylArtist
				+ ", vinylYear=" + vinylYear + ", vinylGenre=" + vinylGenre + ", vinylFormat=" + vinylFormat
				+ ", vinylDetails=" + vinylDetails + "]";
	}

}
