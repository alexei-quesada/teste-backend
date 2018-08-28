package teste.backend.grupo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PutMapping("/grupos/{id}")
	public void updateGrupo(@RequestBody Grupo grupo, @PathVariable int id) {
		grupoService.updateGrupo(id,grupo);
	}
	
	@DeleteMapping("/grupos/{id}")
	public void deleteGrupo(@PathVariable int id){
		grupoService.deleteGrupo(id);
	}

}
