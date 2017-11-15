package dados;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOFactory {

	private static final EntityManagerFactory factory;
	
	static {
		// Startando o server para o WebProject
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		factory = Persistence.createEntityManagerFactory("Atividade07Serv");
		
	}
	
	public static DAOAluno getAlunoDAO() {
		DAOAluno dao = new DAOAluno(factory);
		return dao;
	}
	
}
