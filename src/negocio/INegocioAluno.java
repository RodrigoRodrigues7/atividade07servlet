package negocio;

import java.util.List;
import classesBasicas.Aluno;

public interface INegocioAluno extends INegocioGenerico {

	public void insert(Aluno aluno);
	
	public void update(Aluno aluno);
	
	public void remove(Aluno aluno);
	
	public void refresh(Aluno aluno);
	
	public List<Aluno> getAllByName(Aluno filtro);
	
}
