package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classesBasicas.Aluno;
import negocio.Fachada;

@WebServlet("/cadastraraluno")
public class CadastrarAluno extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {	
		
    	String nome = req.getParameter("nome");
    	String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
    	
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
		
		Fachada fachada = Fachada.getInstance();
		fachada.insert(aluno);
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		String message;
		
		message = "O aluno <b>" + aluno.getNome() + "<b>,<br>foi registrado com sucesso!";
		req.setAttribute("message", message);
		req.getRequestDispatcher("/Welcome.jsp").forward(req, res);;
		
		out.close();
		
	}

}
