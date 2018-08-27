package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Metodospmelhorar implements Identificavel {

	@Id
	private Long id;
	private String comp1;

	public Long getId()	{
		return id;
	}

	public void setId(Long id_metodos) {
		this.id = id_metodos;
	}

	public String getComp1() {
		return comp1;
	}

	public void setComp1(String comp1) {
		this.comp1 = comp1;
	}

}
