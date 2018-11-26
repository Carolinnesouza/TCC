package entidades;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Metodospmelhorar implements Identificavel {

	@Id
	private Long id;
	
	private Integer indexInicial;
	private Integer indexFim;
	
	@ManyToOne
	@JoinColumn(name="id_redacao")
	private Redacao redacao;
	
	@OneToMany(mappedBy="metodospmelhorar")
	private Set<Comentario> comentarios;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	private Boolean resolvido;
	
	

	public Long getId()	{
		return id;
	}

	public void setId(Long id_metodos) {
		this.id = id_metodos;
	}

	public Integer getIndexInicial() {
		return indexInicial;
	}

	public void setIndexInicial(Integer indexInicial) {
		this.indexInicial = indexInicial;
	}

	public Integer getIndexFim() {
		return indexFim;
	}

	public void setIndexFim(Integer indexFim) {
		this.indexFim = indexFim;
	}

	public Redacao getRedacao() {
		return redacao;
	}

	public void setRedacao(Redacao redacao) {
		this.redacao = redacao;
	}

	public Set<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Boolean getResolvido() {
		return resolvido;
	}

	public void setResolvido(Boolean resolvido) {
		this.resolvido = resolvido;
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
		Metodospmelhorar other = (Metodospmelhorar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}
