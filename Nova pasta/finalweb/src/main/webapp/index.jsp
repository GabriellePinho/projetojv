<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Projeto Final - Web + Banco de Dados</title>
		
		<link href="css/estilo.css" rel="stylesheet">
	</head>
	<body>
		<div id="pagina">
			<div id="barra">
				<div id="logo"><img src="images/senac-logo.png" height="100px"></div>
				<div id="menu">Login</div>
			</div>
			<div id="conteudo">
				<form method="post" action="home.jsp">
					<label>Usu�rio</label>
					<input type="text" id="txtUsuario" name="txtUsuario"/>
					<label>Senha</label>
					<input type="password" id="txtSenha" name="txtSenha"/>
					<input type="submit" value="Entrar">
				</form>
			</div>
			<div id="rodape">Copyright &copy 2023</div>
		</div>
	</body>
</html>
