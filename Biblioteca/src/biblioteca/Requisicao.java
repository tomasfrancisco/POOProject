package biblioteca;
import java.util.*;
class Requisicao {

	private int numero;
	private Item item;
	private Utilizador utilizador;
	private Date data;
        private Date dataentrega=null;
        
        
        public Requisicao(Item item, Utilizador utilizador, int ano, int mes, int dia, int numero) 
        {
            this.item = item;
            this.utilizador = utilizador;
            this.data = new Date((ano-1900),(mes-1),dia);
            this.numero = numero;
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

	public Date getData() {
		return this.data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(int ano, int mes , int dia) {
		this.data = new Date((ano-1900),(mes-1),dia);
	}
        /**
	 * 
	 * @param data
	 */
        public Date getDataEnt()
        {
            return this.dataentrega;
        }
        public void setDataEnt(int ano, int mes , int dia)
        {
            this.dataentrega=new Date((ano-1900),(mes-1),dia);
        }

	

}