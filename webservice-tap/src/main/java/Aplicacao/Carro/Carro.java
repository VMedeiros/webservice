package Aplicacao.Carro;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Carro implements Serializable {

	private static final long serialVersionUID = -7799369695818057571L;
	
	@Id
	private int id;
	private String nome;
	private String modelo;
	private int ano;
	
	public Carro(int id, String nome, String modelo, int ano) {
		
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
	}

	public Carro () {
		
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", nome=" + nome + ", modelo=" + modelo + ", ano=" + ano + "]";
	}
	
}
