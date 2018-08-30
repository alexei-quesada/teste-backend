package teste.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import teste.backend.model.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, Integer> {
	
	
	 @Query(value = "SELECT count(id) FROM cliente WHERE grupo_id = ?1", nativeQuery = true)
	 int getClientCount(int grupoId);
	
}
