package biblioteca;

abstract class Utilizador {
        protected static final int ALUNO = 1;
        protected static final int PROF = 2;
        protected static final int ADMIN = 3;
        protected static final int ERRO = -1;
    
	protected String nome;
	protected int numero;
	protected String morada;
	protected String telefone;
	protected String email;
	protected String data_nascimento;
	protected String username;
	protected String password;
	protected int tipo;
        
      
	public String getNome() {
		return this.nome;
	}

	/**
	 * 
	 * @param nome 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return this.numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMorada() {
		return this.morada;
	}

	/**
	 * 
	 * @param morada
	 */
	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getTelefone() {
		return this.telefone;
	}

	/**
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getData_nascimento() {
		return this.data_nascimento;
	}

	/**
	 * 
	 * @param data_nascimento
	 */
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getUsername() {
		return this.username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
        
        /**
	 * 
	 * @param tipo
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
        
        public int getTipo() {
		return this.tipo;
	}

}