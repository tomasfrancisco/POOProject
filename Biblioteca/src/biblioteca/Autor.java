package biblioteca;

public class Autor {

	private String nome;
	private int numero;
	private String data_nascimento;

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

	public Autor() {
		throw new UnsupportedOperationException();
	}

}