package com.example.vinyylilista.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.vinyylilista.domain.Artist;
import com.example.vinyylilista.domain.ArtistRepository;

@Controller
public class ArtistController {
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@GetMapping("/artistlist")
	public String getArtist(Model model) {
		model.addAttribute("artists", artistRepository.findAll());
		return "artistlist";
	}
	@GetMapping("/addartist")
	public String addArtist(Model model) {
		model.addAttribute("artist", new Artist());
		return "addartist";
	}
	@PostMapping("/saveartist")
	public String save(Artist artist) {
		artistRepository.save(artist);
		return "redirect:artistlist";
	}

}
