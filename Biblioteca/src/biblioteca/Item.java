package biblioteca;

public class Item {

	private String titulo;
	private String ano_publicacao;
	private String editora;

	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno_publicacao() {
		return this.ano_publicacao;
	}

	/**
	 * 
	 * @param ano_pub
	 */
	public void setAno_publicacao(String ano_pub) {
		this.ano_publicacao = ano_pub;
	}

	public String getEditora() {
		return this.editora;
	}

	/**
	 * 
	 * @param editora
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Item() {
		throw new UnsupportedOperationException();
	}

}