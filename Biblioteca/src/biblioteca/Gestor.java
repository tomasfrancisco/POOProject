package biblioteca;

import java.util.*;

class Gestor {

	private ArrayList <Utilizador> utilizadores;
	private ArrayList <Item> itens;
	private ArrayList <Requisicao> requisicoes;
        
        
	public Gestor() {
            this.utilizadores = new ArrayList();
            this.itens = new ArrayList();
            this.requisicoes = new ArrayList();
	}

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
         * @param ocorre
         * @return 
         */
        ArrayList <Utilizador> getUtilizador(String ocorre)
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
        
        /**
         * Retorna os itens mais requisitados do mes e ano passados por parametro
         * @param mes
         * @param ano
         * @return 
         */
        public ArrayList <Item> getTopOne(int mes, int ano)
        {
            ArrayList <Item> top = new ArrayList();
            int max = 0;
            int[] contador = new int[this.itens.size()];
            
            /**
             * Obtém o número de ocorrências dos itens
             */
            for(int i = 0; i < this.requisicoes.size(); i++)
            {
                Date data = this.requisicoes.get(i).getData();
                Item item = this.requisicoes.get(i).getItem();
                if((data.getYear() + 1900) == ano)
                {
                    if((data.getMonth() + 1) == mes)
                    {
                        contador[this.itens.indexOf(item)] += 1;
                    }
                }
            }
            
            /**
             * Obtém o objecto com mais requisições
             */
            for(int i = 0; i < contador.length; i++)
            {
                if(contador[i] > max)
                {
                    top.add(this.itens.get(i));
                }
            }        
            return top;
        }
        
        

        
        /**
         * Metodo que Procura a existência de requisicoes e devolve array caso nao encontre nenhuma, no mes do ano inseridos
         * @param mes
         * @param ano
         * @return 
         */
	public ArrayList <Item> nRequesitados(int mes, int ano)
        {
            ArrayList <Item> nre=new ArrayList ();
            for(int i=0;i<this.itens.size();i++)
            {
                boolean ver=false;
                for(int j=0;j<this.requisicoes.size();j++)
                {
                    Date dt=this.requisicoes.get(j).getData();
                    if((dt.getMonth()==mes)&&(dt.getYear()==ano)&&(this.itens.get(i)==this.requisicoes.get(j).getItem()))
                    {
                        ver=true;
                        break;
                    }
                }
                if(ver==false)
                    nre.add(this.itens.get(i));
            }
            return nre;
        }
        
         /**
         * Este metodo devolve num arraylist todos os itens que apresentam uma data de entrega nula
         * @return 
         */
        public ArrayList<Item> itensRequisitados()
        {
            ArrayList <Item> item=new ArrayList();
            for(int i=0;i<this.requisicoes.size();i++)
            {
                if(this.requisicoes.get(i).getDataEnt()==null)
                    item.add(this.requisicoes.get(i).getItem());
            }
            return item;
        }
        
         /**
         * Este metodo retorna num arraulist todos os itens atrasados
         * @param livro /Recebe como parametro de entrada o indicador se pretende listar livros (true) ou dvds (false)
         * @param data/ Refere se a data acutal
         * @return 
         */
        public ArrayList <Item> itensAtrasados(boolean livro)
        {
            Date dt= new Date ();
            ArrayList <Item> res=new ArrayList();
            for(int i=0;i<this.requisicoes.size();i++)
            {
                if(((livro==true)&&(this.requisicoes.get(i).getItem().getClass().getName().equals("Livro")))||((livro==false)&&(this.requisicoes.get(i).getItem().getClass().getName().equals("Dvd"))))
                {
                    if((this.requisicoes.get(i).getUtilizador().getTipo()==1)&&(this.requisicoes.get(i).getDataEnt()==null))
                    {
                        if(dt.compareTo(somaData(this.requisicoes.get(i).getData(),5))>0)/*NUMERO MAGICO A SER ALTERADO*/
                                {
                                    res.add(this.requisicoes.get(i).getItem());
                                }
                    }
                    else if(this.requisicoes.get(i).getUtilizador().getTipo()==2&&(this.requisicoes.get(i).getDataEnt()==null))
                    {
                        if(dt.compareTo(somaData(this.requisicoes.get(i).getData(),92))>0)/*NUMERO MAGICO A SER ALTERADO*/
                                {
                                    res.add(this.requisicoes.get(i).getItem());
                                }
                    }
                }
            }
            return res;
        }
         /**
         * Este metodo tem como funcao adicionar os dias a uma determinada data
         * @param data
         * @param dias
         * @return 
         */
        public Date somaData(Date data, int dias)
        {
            Calendar cal = Calendar.getInstance();    
            cal.set(Calendar.DAY_OF_MONTH, data.getDay());
            cal.set(Calendar.MONTH, data.getMonth());
            cal.set(Calendar.YEAR, data.getYear());   
            cal.add(Calendar.DAY_OF_MONTH, dias);
            return new Date(cal.get(1)-1900,cal.get(2)-1,cal.get(5));
        }
         /**
         * Numero médio de requisicoes e numero maximo de reqeuisicoes
         * @param mes
         * @return 
         */
        public void estatistica(int mes, int ano)
        {
            int diamax=0;
            int reqdiamax=0;
            int somarequisicoes=0;
            for(int i=1;i<31;i++)
            {
                int reqdia=0;
                for(int j=0;j<this.requisicoes.size();j++)
                {
                    if((this.requisicoes.get(j).getData().getMonth()==mes)&&(this.requisicoes.get(j).getData().getYear()==ano))
                    {
                        somarequisicoes++;
                        reqdia++;
                    }
                }
                if(reqdia>reqdiamax)
                {
                    reqdiamax=reqdia;
                    diamax=i;
                }
            }
            System.out.println("Numero médio de Requisicoes por dia :"+somarequisicoes/30+"\nDia em que houve mais requisicoes: "+diamax+"; Com "+reqdiamax+" requisicoes");
        }
       
}
