package teste.backend.grupo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grupo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;
	
	public Grupo() {
	}
	
	public Grupo(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nome=" + nome + "]";
	}


	
	

}
