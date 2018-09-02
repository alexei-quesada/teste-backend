package teste.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import teste.backend.model.Grupo;
import teste.backend.service.GrupoService;


@CrossOrigin
@RestController
public class GrupoController {
	
	@Autowired
	private GrupoService grupoService;
	
	@GetMapping("/grupos")
	public List<Grupo> getAllGrupos(){
		return grupoService.getAllGrupos();
	}
	
	@GetMapping("/grupos/{id}")
	public Grupo getGrupoById(@PathVariable int id){
		return grupoService.getGrupoById(id);
	}
	
	@PostMapping(path="/grupos")
	public void addGrupo(@RequestBody Grupo grupo) {
		grupoService.addGrupo(grupo);
	}
	
	@PutMapping("/grupos")
	public void updateGrupo(@RequestBody Grupo grupo) {
		grupoService.updateGrupo(grupo);
	}
	
	@DeleteMapping("/grupos/{id}")
	public boolean deleteGrupo(@PathVariable int id){
		return grupoService.deleteGrupo(id);
	}

	@GetMapping("/grupos/count")
	public long getCantGrupos(){
		return grupoService.getCantGrupos();
	}

}
