package servicos;


import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import Dao.UsuarioDAO;
import entidades.Usuario;
import util.TransacionalCdi;


@ApplicationScoped
public class UsuarioService implements Service<Usuario> {


			@Inject
			private UsuarioDAO usuarioDAO;
			
			@Override
			@TransacionalCdi
			public void save(Usuario user) {
				usuarioDAO.save(user);
			}

		
			@Override
			@TransacionalCdi
			public void update(Usuario user)  {
				usuarioDAO.update(user);
			}

		
			@Override
			@TransacionalCdi
			public void remove(Usuario user) {
				usuarioDAO.remove(user);
			}

			@Override
			public Usuario getByID(long userId)  {
					return usuarioDAO.getByID(userId);
			}


			@Override
			public List<Usuario> getAll() {
				// TODO Auto-generated method stub
				return null;
			}

	}
