package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Redacao implements Identificavel {

	private String texto;
	@Id
	private Long id;
	private String autor;
	private String metodospmelhorar; 
	private String login;
	private String senha;
	private String grupo; 



	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getMetodospmelhorar() {
		return metodospmelhorar;
	}

	public void setMetodospmelhorar(String metodospmelhorar) {
		this.metodospmelhorar = metodospmelhorar;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Redacao(String texto, Long id, String autor, String metodospmelhorar, String login, String senha,
			String grupo) {
		super();
		this.texto = texto;
		this.id = id;
		this.autor = autor;
		this.metodospmelhorar = metodospmelhorar;
		this.login = login;
		this.senha = senha;
		this.grupo = grupo;
	}
	
	public Redacao() {
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
