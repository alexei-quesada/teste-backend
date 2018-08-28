package teste.backend.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import teste.backend.grupo.Grupo;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;
	private String cep;
	private String cidade;
	
	@ManyToOne
	private Grupo grupo;
	
	public Cliente() {
	}

	public Cliente(int id, String nome, String cep, String cidade, Grupo grupo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cep = cep;
		this.cidade = cidade;
		this.grupo = grupo;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cep=" + cep + ", cidade=" + cidade + ", grupo=" + grupo
				+ "]";
	}


	
	
	

}
