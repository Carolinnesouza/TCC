package beans;

import entidades.Identificavel;


public class Redacao implements Identificavel{

	private String texto;
	private Long id;
	private String autor;
	private String metodospmelhorar; 

	public String getMetodospmelhorar() {
		return metodospmelhorar;
	}

	public void setMetodospmelhorar(String metodospmelhorar) {
		this.metodospmelhorar = metodospmelhorar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}


}
