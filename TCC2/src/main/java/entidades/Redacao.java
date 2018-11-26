package entidades;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Redacao implements Identificavel {

	@Id
	@GeneratedValue(generator="red_gen")
	@SequenceGenerator(name="red_gen", sequenceName="red_seq")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_metodos_melhorar")
	private Usuario autor;
	
	@ManyToOne
	@JoinColumn(name="id_metodos_melhorar")
	private Usuario revisor;
	
	@OneToMany(mappedBy="redacao")
	private Set<Metodospmelhorar> metodospmelhorar; 
	
	private Double nota;
	private String texto;
	private String login;
	private String senha;
	private String grupo; 



	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public Usuario getRevisor() {
		return revisor;
	}

	public void setRevisor(Usuario revisor) {
		this.revisor = revisor;
	}

	public Set<Metodospmelhorar> getMetodospmelhorar() {
		return metodospmelhorar;
	}

	public void setMetodospmelhorar(Set<Metodospmelhorar> metodospmelhorar) {
		this.metodospmelhorar = metodospmelhorar;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Redacao other = (Redacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



}
