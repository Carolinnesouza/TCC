
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named
public class BasicoBean {
	
	private List<Redacao> redacoes = new ArrayList<Redacao>();
	
	@Inject
	private Long id;
	private Redacao redacao;
	private Redacao autor;
	private Redacao metodospmelhorar;


	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Redacao getMetodospmelhorar() {
		return metodospmelhorar;
	}

	public void setMetodospmelhorar(Redacao metodospmelhorar) {
		this.metodospmelhorar = metodospmelhorar;
	}

	public Redacao getRedacao() {
		return redacao;
	}

	public void setAutor(Redacao autor) {
		this.autor = autor;
	}

	public List<Redacao> getUsuarios() {
		return redacoes;
	}

	public void addRedacao() {
		redacoes.add(redacao);
		redacao = new Redacao(); 
	}
	
	public void removeRedacao() {
		for (Redacao redacao : redacoes) {
			if (redacao.getId() == getId()) {
				redacoes.remove(redacao);
				return;
			}
		}
	}
				
				public String buscarRedacao(Long id) {
					for (Redacao redacao : redacoes) {
						if (redacao.getId() == id) {
							 return redacao.getTexto();
						}
					}
					return null;
	}
				public void atualizar(String texto , Long id) {
					for (Redacao redacao : redacoes) {
						if (redacao.getId() == id) {
							redacao.setTexto(texto);
							return;
						}
					}
				
	}
			

	public List<Redacao> getRedacoes() {
		return redacoes;
	}

	public void setRedacoes(List<Redacao> redacoes) {
		this.redacoes = redacoes;
	}

	public Redacao getAutor() {
		return autor;
	}

	public void setId_redacao(Long id) {
		this.id = id;
	}

	public void setRedacao(Redacao redacao) {
		this.redacao = redacao;
	}
	
	
	
}
