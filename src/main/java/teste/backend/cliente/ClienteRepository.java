package teste.backend.cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	public List<Cliente> findByGrupoId(int id);
	
	public List<Cliente> findByGrupoNome(String nome);
}
