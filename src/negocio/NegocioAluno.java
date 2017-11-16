package negocio;

import java.io.Serializable;
import java.util.List;

import classesBasicas.Aluno;
import dados.DAOAluno;
import dados.DAOFactory;

public class NegocioAluno implements INegocioAluno {

	private DAOAluno dao =DAOFactory.getAlunoDAO();

	@Override
	public void insert(Aluno aluno) {
		dao.insert(aluno);
	}

	@Override
	public void update(Aluno aluno) {
		dao.update(aluno);
	}

	@Override
	public void remove(Aluno aluno) {
		dao.remove(aluno);
	}

	@Override
	public List<Aluno> getAllByName(Aluno filtro) {
		return dao.getAllByName(filtro);
	}

	@Override
	public Aluno searchById(Serializable chave) {
		return dao.searchByKey(chave);
	}

	@Override
	public Aluno getAluno(Aluno filtro) {
		return dao.getAluno(filtro);
	}

}
