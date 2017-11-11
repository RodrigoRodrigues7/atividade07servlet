package dados;

import javax.persistence.EntityManagerFactory;

import classesBasicas.Aluno;

public class DAOAluno extends DAOGenerico<Aluno> {

	public DAOAluno(EntityManagerFactory emf) {
		super(emf);
	}	
	
}
