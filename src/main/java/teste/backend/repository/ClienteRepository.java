package teste.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import teste.backend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	public List<Cliente> findByGrupoId(int id);
	
	public List<Cliente> findByGrupoNome(String nome);
}
