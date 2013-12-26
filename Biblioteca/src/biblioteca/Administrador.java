package biblioteca;

public class Administrador extends Utilizador {

	public Administrador(String nome, String genero, String morada, String telefone, String email, String data_nascimento, String username, String password, int tipo) {
            super.setNome(nome);
            super.setGenero(genero);
            super.setMorada(morada);
            super.setTelefone(telefone);
            super.setEmail(email);
            super.setData_nascimento(data_nascimento);
            super.setUsername(username);
            super.setPassword(password);
            super.setTipo(tipo); 
	}
}