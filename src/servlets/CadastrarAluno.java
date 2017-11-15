package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
    	
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {	
		
    	Aluno aluno = new Aluno();
    	
	    String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
		
		DAOAluno dao = DAOFactory.getAlunoDAO();
		dao.insert(aluno);	
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String message = null;  // message will be sent back to client
		
		message = "Olá " + nome + ".<br>Seja Bem Vindo!";
		req.setAttribute("message", message);
		
		// enviando para o servlet helloworld
		req.getRequestDispatcher("/welcome.jsp").forward(req, res);
		
		
		out.close();
	}

}
