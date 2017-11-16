package negocio;

import java.io.Serializable;
import java.util.List;
import classesBasicas.Aluno;

public interface INegocioAluno {

	public void insert(Aluno aluno);
	
	public void update(Aluno aluno);
	
	public void remove(Aluno aluno);
	
	public List<Aluno> getAllByName(Aluno filtro);
	
	public Aluno searchById(Serializable chave);
	
	public Aluno getAluno(Aluno filtro);
	
}
