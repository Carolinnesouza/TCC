package entidades;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comentario implements Identificavel{

	@Id
	@GeneratedValue(generator="comen_gen")
	@SequenceGenerator(name="comen_gen", sequenceName="comen_seq")
	private Long id;
	
	private String comentario;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	@ManyToOne
	@JoinColumn(name="id_metodos_melhorar")
	private Metodospmelhorar metodospmelhorar;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Metodospmelhorar getMetodospmelhorar() {
		return metodospmelhorar;
	}
	public void setMetodospmelhorar(Metodospmelhorar metodospmelhorar) {
		this.metodospmelhorar = metodospmelhorar;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
		Comentario other = (Comentario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
