package Aplicacao.Produto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Produto implements Serializable {

	private static final long serialVersionUID = -7799369695818057571L;

	
	@Id
	private int id;
	private String nome;
	
	public Produto(int id, String nome) {
		
		this.id = id;
		this.nome = nome;
	}
	
	public Produto() {
		
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
		return "Produto [id=" + id + ", nome=" + nome + "]";
	}

}
	