package biblioteca;

import java.util.*;

class Gestor {

	private ArrayList <Utilizador> utilizadores;
	private ArrayList <Item> itens;
	private ArrayList <Requisicao> requisicoes;

	public ArrayList <Utilizador> getUtilizadores() {
		return this.utilizadores;
	}

	/**
	 * 
	 * @param utilizador
	 */
	public void setUtilizador(Utilizador utilizador) {
		this.utilizadores.add(utilizador);
	}
        
        /**
         * Retorna o utilizador com o numero dado como parametro do método.
         * Caso o utilizador com o número dado não seja encontrado é retornado null.
         * @param numero
         * @return 
         */
        public Utilizador getUtilizador(int numero)
        {
            Utilizador utilizador;
            
            for(int i = 0; i < this.utilizadores.size(); i++)
            {
                if((utilizador = this.utilizadores.get(i)).getNumero() == numero)
                {
                    return utilizador;
                }
                else
                    return null;
            }
            return null;
        }
        
        public Utilizador getUtilizador(String nome)
        {
            ArrayList <Utilizador> ocorrencias;
            Utilizador utilizador;
            for(int i = 0; i < this.utilizadores.size(); i++)
            {
                if((utilizador = this.utilizadores.get(i)).getNome().indexOf(nome) != -1)
                {
                    ocorrencias.add(utilizador);
                }
                else
                    return null;
            }
        }

	public ArrayList <Item> getItens() {
		return this.itens;
	}

	/**
	 * 
	 * @param itens
	 */
	public void setItens(ArrayList <Item> itens) {
		this.itens = itens;
	}
        
        /**
         * Retorna a requisição com o número passado por paramentro do método.
         * Caso a requisicao com o número dado não seja encontrada é retornado null
         * @param numero
         * @return 
         */
	public Requisicao getRequisicao(int numero)
        {
            Requisicao requisicao;
                
            for(int i = 0; i < this.requisicoes.size(); i++)
            {
                if((requisicao = this.requisicoes.get(i)).getNumero() == numero)
                {
                    return requisicao;
                }
                else
                    return null;
            }
            return null;
	}

	/**
	 * 
	 * @param requisicoes
	 */
	public void setRequisicao(Requisicao requisicao) {
		this.requisicoes.add(requisicao);
	}

	public Gestor() {
		throw new UnsupportedOperationException();
	}

	public void removerUtilizador() {
		throw new UnsupportedOperationException();
	}

	public void pesquisarUtilizador() {
		throw new UnsupportedOperationException();
	}

	public void listarUtilizadores() {
		throw new UnsupportedOperationException();
	}

	public void removerItem() {
		throw new UnsupportedOperationException();
	}

	public void pesquisarItem() {
		throw new UnsupportedOperationException();
	}

	public void listarItens() {
		throw new UnsupportedOperationException();
	}

	public void removerRequisicao() {
		throw new UnsupportedOperationException();
	}

	public void pesquisarRequisicao() {
		throw new UnsupportedOperationException();
	}

	public void listarRequisicoes() {
		throw new UnsupportedOperationException();
	}

	public void consultar() {
		throw new UnsupportedOperationException();
	}

	public void requisitar() {
		throw new UnsupportedOperationException();
	}

	public void entregar() {
		throw new UnsupportedOperationException();
	}

	public void eliminar() {
		throw new UnsupportedOperationException();
	}

}