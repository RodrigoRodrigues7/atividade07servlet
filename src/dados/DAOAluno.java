package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Aluno;

public class DAOAluno extends DAOGenerico<Aluno> {

	public DAOAluno(EntityManagerFactory emf) {
		super(emf);
	}	
	
	@SuppressWarnings("unchecked")
	public List<Aluno> getAllByName(Aluno filtro) {
		
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Aluno> listaAlunos = null;
		String consulta = "FROM " + getTableName(filtro) + " WHERE nome LIKE :Nome";
		
		try {
			
			Query query = em.createQuery(consulta, filtro.getClass());
			query.setParameter("Nome ", "%" + ((Aluno) filtro).getNome() + "%");
			listaAlunos = query.getResultList();
			
		} catch (RuntimeException e) {
			e.getStackTrace();
		}
		
		em.close();
		return listaAlunos;
	}
	
	public Aluno getAluno(Aluno filtro) {
		
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		Aluno retorno = null;
		String consulta = "FROM Aluno WHERE cpf = :Cpf";
		
		try {
			
			Query query = em.createQuery(consulta, Aluno.class);
			query.setParameter("Cpf", filtro.getCpf());
			retorno = (Aluno) query.getSingleResult();
			
		} catch (RuntimeException e) {
			e.getStackTrace();
		}
		
		em.close();
		return retorno;
	}
	
}
