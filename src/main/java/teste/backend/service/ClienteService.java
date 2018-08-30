package teste.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teste.backend.model.Cliente;
import teste.backend.model.Grupo;
import teste.backend.repository.ClienteRepository;
import teste.backend.repository.GrupoRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	
	public List<Cliente> getClientesByGrupo(int grupoId){
		return clienteRepository.findByGrupoId(grupoId);
	}

	public Cliente getClienteById(int id) {
		return clienteRepository.findOne(id);
	}

	public boolean addCliente(Cliente cliente, int grupoId) {

		Grupo grupo = grupoRepository.findOne(grupoId);
		if(grupo!=null) {
		    cliente.setGrupo(grupo);
			clienteRepository.save(cliente);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean updateCliente(Cliente cliente, int grupoId) {
		Grupo grupo = grupoRepository.findOne(grupoId);
		if(grupo!=null) {
		    cliente.setGrupo(grupo);
			clienteRepository.save(cliente);
			return true;
		}
		else {
			return false;
		}
	}

	public void deleteCliente(int id) {
		clienteRepository.delete(id);
	}

	public List<Cliente> getClientes() {
		return clienteRepository.findAll();
	}

}
