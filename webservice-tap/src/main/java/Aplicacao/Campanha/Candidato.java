package Aplicacao.Campanha;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Candidato implements Serializable {

	private static final long serialVersionUID = -7799369695818057571L;
	
	@Id
	private int id;
	private String nome;
	private String partido;
	private int numero;
	
	public Candidato(int id, String nome, String partido, int numero) {
		
		this.id = id;
		this.nome = nome;
		this.partido = partido;
		this.numero = numero;
	}
	
	public Candidato() {
		
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

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nome=" + nome + ", partido=" + partido + ", numero=" + numero + "]";
	}

}
