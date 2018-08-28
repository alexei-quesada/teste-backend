package teste.backend.grupo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoService {
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	
	public List<Grupo> getAllGrupos(){
		return grupoRepository.findAll();
	}

	public Grupo getGrupoById(int id) {
		return grupoRepository.findOne(id);
	}

	public void addGrupo(Grupo grupo) {
		grupoRepository.save(grupo);
	}

	public void updateGrupo(int id, Grupo grupo) {
		grupoRepository.save(grupo);
	}

	public void deleteGrupo(int id) {
		grupoRepository.delete(id);
	}

}
