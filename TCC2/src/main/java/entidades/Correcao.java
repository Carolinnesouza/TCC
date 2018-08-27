package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Correcao implements Identificavel{

	@Id
	private Long id;
	private String autor_correcao; 
	private int nota;
	public Long getId() {
		return id;
	}
	public void setId(Long id_correcao) {
		this.id = id_correcao;
	}
	public String getAutor_correcao() {
		return autor_correcao;
	}
	public void setAutor_correcao(String autor_correcao) {
		this.autor_correcao = autor_correcao;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
	}

