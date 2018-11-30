package servicos;

import java.util.List;

import javax.inject.Inject;

import Dao.ComentarioDAO;
import entidades.Comentario;
import util.TransacionalCdi;

public class ComentarioService implements Service<Comentario>{

		@Inject
		private ComentarioDAO comentarioDAO;
		
		@Override
		@TransacionalCdi
		public void save(Comentario user) {
			comentarioDAO.save(user);
		}

	
		@Override
		@TransacionalCdi
		public void update(Comentario user)  {
			comentarioDAO.update(user);
		}

	
		@Override
		@TransacionalCdi
		public void remove(Comentario user) {
			comentarioDAO.remove(user);
		}

		@Override
		public Comentario getByID(long userId)  {
				return comentarioDAO.getByID(userId);
		}


		@Override
		public List<Comentario> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

}