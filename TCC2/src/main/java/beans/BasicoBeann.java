package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import servicos.RedacaoService;

@ViewScoped
@Named
public class BasicoBeann implements Serializable {

	@Inject
	private RedacaoService service;
	private Redacao entidade;

	private List<Redacao> entidades = new ArrayList<Redacao>();

	public BasicoBeann() {
	}

	@PostConstruct
	public void init() {
		entidade = newRedacao();
		entidades = getService().getAll();
	}

	public void remove(Redacao entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Redacao getEntidade() {
		return entidade;
	}

	public void setRedacao(Redacao entidade) {
		this.entidade = entidade;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newRedacao();
	}

	protected Redacao newRedacao() {
		return new Redacao();
	}

	public RedacaoService getService() {
		return service;
	}

}
