package br.edu.ifpb.esperanca.daw2.services;

import java.util.List;

import javax.inject.Inject;

import beans.Redacao;
import br.edu.ifpb.esperanca.daw2.dao.RedacaoDAO;
import br.edu.ifpb.esperanca.daw2.dao.UsuarioDAO;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

public class RedacaoService implements Service<Redacao>{

	@Inject
	private RedacaoDAO redacaoDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Redacao user) {
		redacaoDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Redacao user)  {
			redacaoDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Redacao user) {
		redacaoDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Redacao getByID(long userId)  {
			return redacaoDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Redacao> getAll() {
			return redacaoDAO.getAll();
	}
	
}
