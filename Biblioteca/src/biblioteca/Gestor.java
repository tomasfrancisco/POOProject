package biblioteca;

import java.util.*;

class Gestor {

	private final ArrayList <Utilizador> utilizadores = new ArrayList();
	private final ArrayList <Item> itens = new ArrayList();
	private final ArrayList <Requisicao> requisicoes = new ArrayList();

	public ArrayList <Utilizador> getUtilizadores() {
		return this.utilizadores;
	}

	/**
	 * Adiciona um utilizador à colecção
         * Retorna true caso seja adicionado com sucesso
	 * @param utilizador
	 */
	public boolean setUtilizador(Utilizador utilizador) {
		return this.utilizadores.add(utilizador);
	}
        
        /**
         * Remove o objecto utilizador da colecção
         * Caso tenha sido removido devolve true, caso não tenha encontrado devolve false
         * @param utilizador
         * @return 
         */
        public boolean removeUtilizador(Utilizador utilizador)
        {
            return this.utilizadores.remove(utilizador);
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
            }
            return null;
        }
        
        /**
         * Retorna uma lista de objectos de Utilizador onde há ocorrencias de ocorre
         * Permite a procura por nome ou por telefone de utilizador
         * @param nome
         * @return 
         */
        public ArrayList <Utilizador> getUtilizador(String ocorre)
        {
            ArrayList <Utilizador> ocorrencias = new ArrayList();
            Utilizador utilizador;
            for(int i = 0; i < this.utilizadores.size(); i++)
            {
                if((utilizador = this.utilizadores.get(i)).getNome().indexOf(ocorre) != -1)
                {
                    ocorrencias.add(utilizador);
                }
                else if((utilizador = this.utilizadores.get(i)).getTelefone().indexOf(ocorre) != -1)
                {
                   ocorrencias.add(utilizador);
                }
            }
            return ocorrencias;
        }

        public 
        
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
         * Retorna a requisição com o número passado por paramentro.
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
            }
            return null;
	}
<<<<<<< HEAD
        
        /**
         * Retorna uma lista de objectos de Requisicao onde há ocorrencias de numero
         * @param numero
         * @return 
         */
        public ArrayList <Requisicao> getRequisicoesUtilizador(int numero)
        {
            ArrayList <Requisicao> ocorrencias = new ArrayList();
            Requisicao requisicao;
            
            for(int i = 0; i < this.requisicoes.size(); i++)
            {
                if((requisicao = this.requisicoes.get(i)).getUtilizador().getNumero() == numero)
                {
                    ocorrencias.add(requisicao);
                }
            }
            return ocorrencias;            
        }

=======
        /*
         *Retorna o Item Pelo seu número
         */
        public Item getItem(int numero)
        {
            Item x=null; 
            for(int i=0;i<this.itens.size();i++)
            {
                if((x=this.itens.get(i)).getNumero()==numero)
                {
                   return  x;
                }
            }
            return x;
        }
        /*
         *Remove o item da ArrayList pelo numero
         */
        public boolean RemoveItem(int numero)
        {
            Item x=null;
            for(int i=0;i<this.itens.size();i++)
            {
                if((x=this.itens.get(i)).getNumero()==numero)
                {
                    return this.itens.remove(x);
                }
            }
            return false;
        }
        /*
         *Pesquisa o item no ArrayList pelo seu nome
         */
        public void PesquisaItem(String nome)
        {
            Item x=null;
            for(int i=0;i<this.itens.size();i++)
            {
                if((x=this.itens.get(i)).getTitulo().indexOf(nome)!=-1)
                {
                    System.out.println(x.toString());
                }
            }
        }
        /*
         *Adiciona um item ao ArrayList de Itens
         */
        public void setItem(Item x)
        {
            this.itens.add(x);
        }
>>>>>>> Novas funcoes
	/**
	 * Adiciona uma requisição à colecção
         * Retorna true caso seja adicionada com sucesso
	 * @param requisicoes
	 */
	public boolean setRequisicao(Requisicao requisicao) {
            return this.requisicoes.add(requisicao);
	}
        
        /**
         * Remove o objecto requisicao da colecção
         * Caso tenha sido removido devolve true, caso não tenha encontrado devolve false
         * @param requisicao
         * @return 
         */
        public boolean removeRequisicao(Requisicao requisicao)
        {
            return this.requisicoes.remove(requisicao);
        }

	public Gestor() {
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