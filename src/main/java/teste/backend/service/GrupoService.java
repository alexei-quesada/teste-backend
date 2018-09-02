package teste.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teste.backend.model.Grupo;
import teste.backend.repository.GrupoRepository;

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

	public Grupo addGrupo(Grupo grupo) {
		return grupoRepository.save(grupo);
	}

	public Grupo updateGrupo(Grupo grupo) {
		return grupoRepository.save(grupo);
	}

	public boolean deleteGrupo(int id) {
		boolean deleted = false;
		if(grupoRepository.getClientCount(id)==0) {
			grupoRepository.delete(id);
			deleted = true;
		}
		return deleted;	
	}

	public long getCantGrupos() {
		return grupoRepository.count();
	}

}
