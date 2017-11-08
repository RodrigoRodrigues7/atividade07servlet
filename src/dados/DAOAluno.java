package dados;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;

public class DAOAluno extends DAOGenerico<Entity> {

	public DAOAluno(EntityManagerFactory emf) {
		super(emf);
	}	
	
}
