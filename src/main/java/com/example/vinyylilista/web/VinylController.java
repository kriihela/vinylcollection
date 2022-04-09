package com.example.vinyylilista.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.vinyylilista.domain.ArtistRepository;
import com.example.vinyylilista.domain.Vinyl;
import com.example.vinyylilista.domain.VinylRepository;

@Controller
public class VinylController {
	
	@Autowired
	private VinylRepository vinylRepository;
	@Autowired
	private ArtistRepository artistRepository;
	
	@GetMapping({"/", "index"})
	public String getVinyl(Model model) {
		model.addAttribute("vinyls", vinylRepository.findAll());
		return "index";
	}
	//REST all vinyls
	@GetMapping("/vinyls")
	public @ResponseBody List<Vinyl> vinylListRest() {	
		return (List<Vinyl>) vinylRepository.findAll();
	}
	//REST vinyl by id
	@GetMapping("/vinyl/{vinylId}")
	public @ResponseBody Optional<Vinyl> findVinylRest(@PathVariable("vinylId") Long vinylId) {
		return vinylRepository.findById(vinylId);
	}
	@GetMapping("/add")
	public String addVinyl(Model model) {
		model.addAttribute("vinyl", new Vinyl());
		model.addAttribute("artists", artistRepository.findAll());
		return "addvinyl";
	}
	@PostMapping(value = "/save")
	public String save(Vinyl vinyl) {
		vinylRepository.save(vinyl);
		return "redirect:index";
	}
	@GetMapping(value = "/delete/{vinylId}")
	public String deleteVinyl(@PathVariable("vinylId") Long vinylId, Model model) {
		vinylRepository.deleteById(vinylId);
		return "redirect:../index";
	}
	@GetMapping(value = "/edit/{vinylId}")
	public String editVinyl(@PathVariable("vinylId") Long vinylId, Model model) {
		model.addAttribute("vinyl", vinylRepository.findById(vinylId));
		model.addAttribute("artists", artistRepository.findAll());
		return "editvinyl";
	}

}
