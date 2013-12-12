package biblioteca;

class Requisicao {

	private int numero;
	private Item item;
	private Utilizador utilizador;
	private String data;

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

	public Item getItem() {
		return this.item;
	}

	/**
	 * 
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	public Utilizador getUtilizador() {
		return this.utilizador;
	}

	/**
	 * 
	 * @param utilizador
	 */
	public void setUtilizador(Utilizador utilizador) {
		this.utilizador = utilizador;
	}

	public String getData() {
		return this.data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}

	public Requisicao(Item item, Utilizador utilizador, String data) {
            this.item = item;
            this.utilizador = utilizador;
            this.data = data;
	}

}