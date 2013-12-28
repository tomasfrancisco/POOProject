package biblioteca;

import java.util.*;

abstract class Utilizador {
    
	protected String nome;
        protected String genero;
	protected double numero;
	protected String morada;
        protected String codigo_postal;
        protected String localidade;
	protected String telefone;
	protected String email;
	protected String data_nascimento;
	protected String username;
	protected String password;
	protected int tipo;
        
        protected static final int ALUNO = 1;
        protected static final int PROF = 2;
        protected static final int ADMIN = 3;
        protected static final int ERRO = -1;
        
      
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
        
        public String getGenero()
        {
            return this.genero;
        }
        
        public void setGenero(String genero)
        {
            this.genero = genero;
        }

	public double getNumero() {
		return this.numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(double numero) {
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
        
        public String getCodigo_postal()
        {
            return this.codigo_postal;
        }
        
        /**
         * Retorna o primeiro campo do código postal
         * @return 
         */
        public String getCodigo_postalFirst()
        {
            String field = null;
            
            StringTokenizer token = new StringTokenizer(this.codigo_postal);
            
            if(token.hasMoreElements())
            {
                field = token.nextToken();
            }
            return field;
        }
        
        /**
         * Retorna o segundo campo do código postal
         * @return 
         */
        public String getCodigo_postalLast()
        {
            String field = null;
            
            StringTokenizer token = new StringTokenizer(this.codigo_postal);
            
            while(token.hasMoreElements())
            {
                field = token.nextToken();
            }
            return field;
        }
        
        /**
	 * 
	 * @param codigo_postal
	 */
	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
        
        public String getLocalidade()
        {
            return this.localidade;
        }
        
        /**
	 * 
	 * @param localidade
	 */
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
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
         * Faz um parse à data de nascimento e retorna o dia
         * @return 
         */
        public String getDataDia()
        {
            String dia = null;
            
            StringTokenizer token = new StringTokenizer(this.data_nascimento);
            
            if(token.hasMoreElements())
            {
                dia = token.nextToken();
            }
            return dia;
        }
        
        /**
         * Faz um parse à data de nascimento e retorna o mes (ex. "Janeiro")
         * @return 
         */
        public String getDataMes()
        {
            String mes = null;
            
            StringTokenizer token = new StringTokenizer(this.data_nascimento);
            
            for(int i = 1; i <= token.countTokens(); i++)
            {
                if(i == 3)
                {
                    mes = token.nextToken();
                }
                else
                    token.nextToken();
            }
            return mes;
        }
        
        /**
         * Faz um parse à data de nascimento e retorna o ano
         * @return 
         */
        public String getDataAno()
        {
            String ano = null;
            
            StringTokenizer token = new StringTokenizer(this.data_nascimento);
            System.out.println(data_nascimento);
            
            while(token.hasMoreElements())                
                ano = token.nextToken();
        
            return ano;
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