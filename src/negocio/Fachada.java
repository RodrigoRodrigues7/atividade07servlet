package negocio;

import java.io.Serializable;
import java.util.List;

import classesBasicas.Aluno;

public class Fachada implements INegocioAluno {

	private static Fachada fachada;
	private INegocioAluno negocioAluno;
	
	private Fachada() {
		negocioAluno = new NegocioAluno();
	}
	
	public static Fachada getInstance() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	}	
		
	@Override
	public void insert(Aluno aluno) {
		negocioAluno.insert(aluno);
	}

	@Override
	public void update(Aluno aluno) {
		negocioAluno.update(aluno);
	}

	@Override
	public void remove(Aluno aluno) {
		negocioAluno.remove(aluno);
	}

	@Override
	public List<Aluno> getAllByName(Aluno filtro) {
		return negocioAluno.getAllByName(filtro);
	}

	@Override
	public Aluno searchById(Serializable chave) {
		return negocioAluno.searchById(chave);
	}

	@Override
	public Aluno getAluno(Aluno filtro) {
		return negocioAluno.getAluno(filtro);
	}

}
