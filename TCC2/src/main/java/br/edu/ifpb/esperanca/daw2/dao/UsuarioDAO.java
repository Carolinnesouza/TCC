package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;


public class UsuarioDAO extends DAO<Redacao> {
	
	public UsuarioDAO() {
		super(Redacao.class);
	}

	public List<Redacao> findBy(RedacaoFiltro filtro) {
		return null;
	}
	
}
