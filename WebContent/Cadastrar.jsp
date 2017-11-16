<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cadastrar Aluno</title>

</head>
<body>

	<h1>Insira os Dados do Aluno</h1>
	<form action="cadastraraluno">
		
		Nome: <input type="text" name="nome" placeholder="Enter Name Here">
		<br>
		CPF: <input type="text" name="cpf" placeholder="Enter Cpf Here">
		<br>
		Email: <input type="text" name="email" placeholder="Enter Email Here">
		<br>
		<br>

		<button type="submit" value="cadastrar">Cadastrar</button>
		<button type="reset">Limpar</button>

	</form>

</body>
</html>