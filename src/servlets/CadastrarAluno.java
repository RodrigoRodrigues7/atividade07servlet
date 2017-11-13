package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classesBasicas.Aluno;
import dados.DAOAluno;
import dados.DAOFactory;

@WebServlet("/cadastraraluno")
public class CadastrarAluno extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public CadastrarAluno() {
    	
    }
   
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    	Aluno aluno = new Aluno();
    	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");			
			
	    	String Rnome = req.getParameter("nome");
			String Rcpf = req.getParameter("cpf");
			String Remail = req.getParameter("email");
			aluno.setNome(Rnome);
			aluno.setCpf(Rcpf);
			aluno.setEmail(Remail);
			
			DAOAluno dao = DAOFactory.getAlunoDAO();
			dao.insert(aluno);
			
		} catch (Exception e) {
			e.getMessage();
		}	
		
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Aluno cadastrado com sucesso!");
		out.println("</body>");
		out.println("</html>");
		
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {	
	
		
		
	}

}
