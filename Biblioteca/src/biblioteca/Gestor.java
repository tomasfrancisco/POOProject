package biblioteca;

import java.util.*;

<<<<<<< HEAD
class Gestor {
 
 
        
	private final ArrayList <Utilizador> utilizadores = new ArrayList();
	private final ArrayList <Item> itens = new ArrayList();
	private final ArrayList <Requisicao> requisicoes = new ArrayList();
        private final ArrayList <Requisicao> entregas = new ArrayList();
=======
abstract class Gestor {

	private static final ArrayList <Utilizador> utilizadores = new ArrayList();
	private static final ArrayList <Item> itens = new ArrayList();
	private static final ArrayList <Requisicao> requisicoes = new ArrayList();
        
>>>>>>> origin/master

	public static ArrayList <Utilizador> getUtilizadores() {
		return utilizadores;
	}

	/**
	 * Adiciona um utilizador à colecção
         * Retorna true caso seja adicionado com sucesso
	 * @param utilizador
	 */
	public static boolean setUtilizador(Utilizador utilizador) {
		return utilizadores.add(utilizador);
	}
        
        /**
         * Remove o objecto utilizador da colecção
         * Caso tenha sido removido devolve true, caso não tenha encontrado devolve false
         * @param utilizador
         * @return 
         */
        public static boolean removeUtilizador(Utilizador utilizador)
        {
            return utilizadores.remove(utilizador);
        }
        
        /**
         * Retorna o utilizador com o numero dado como parametro do método.
         * Caso o utilizador com o número dado não seja encontrado é retornado null.
         * @param numero
         * @return 
         */
        public static Utilizador getUtilizador(int numero)
        {
            Utilizador utilizador;
            
            for(int i = 0; i < utilizadores.size(); i++)
            {
                if((utilizador = utilizadores.get(i)).getNumero() == numero)
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
        public static ArrayList <Utilizador> getUtilizador(String ocorre)
        {
            ArrayList <Utilizador> ocorrencias = new ArrayList();
            Utilizador utilizador;
            for(int i = 0; i < utilizadores.size(); i++)
            {
                if((utilizador = utilizadores.get(i)).getNome().indexOf(ocorre) != -1)
                {
                    ocorrencias.add(utilizador);
                }
                else if((utilizador = utilizadores.get(i)).getTelefone().indexOf(ocorre) != -1)
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
	public static Requisicao getRequisicao(int numero)
        {
            Requisicao requisicao;
                
            for(int i = 0; i < requisicoes.size(); i++)
            {
                if((requisicao = requisicoes.get(i)).getNumero() == numero)
                {
                    return requisicao;
                }
            }
            return null;
	}

        /*
         *Retorna o Item Pelo seu número
         */
        public static Item getItem(int numero)
        {
            Item x=null; 
            for(int i = 0;i < itens.size(); i++)
            {
                if((x = itens.get(i)).getNumero() == numero)
                {
                   return  x;
                }
            }
            return x;
        }
        
        /*
         *Remove o item da ArrayList pelo numero
         */
        public static boolean RemoveItem(int numero)
        {
            Item x = null;
            for(int i = 0; i < itens.size(); i++)
            {
                if((x = itens.get(i)).getNumero() == numero)
                {
                    return itens.remove(x);
                }
            }
            return false;
        }
        /*
         *Pesquisa o item no ArrayList pelo seu nome
         */
<<<<<<< HEAD
        public void pesquisaItem(String nome)
=======
        public static void PesquisaItem(String nome)
>>>>>>> origin/master
        {
            Item x = null;
            for(int i = 0; i < itens.size(); i++)
            {
                if((x = itens.get(i)).getTitulo().indexOf(nome)!=-1)
                {
                    System.out.println(x.toString());
                }
            }
        }
        /*
         *Adiciona um item ao ArrayList de Itens
         */
        public static void setItem(Item x)
        {
            itens.add(x);
        }
        
        /**
         * Retorna uma lista de objectos de Requisicao onde há ocorrencias de numero
         * @param numero
         * @return 
         */
        public static ArrayList <Requisicao> getRequisicoesUtilizador(int numero)
        {
            ArrayList <Requisicao> ocorrencias = new ArrayList();
            Requisicao requisicao;
            
            for(int i = 0; i < requisicoes.size(); i++)
            {
                if((requisicao = requisicoes.get(i)).getUtilizador().getNumero() == numero)
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
	public static boolean setRequisicao(Requisicao requisicao) {
            return requisicoes.add(requisicao);
	}
        
        /**
         * Remove o objecto requisicao da colecção
         * Caso tenha sido removido devolve true, caso não tenha encontrado devolve false
         * @param requisicao
         * @return 
         */
        public static boolean removeRequisicao(Requisicao requisicao)
        {
            return requisicoes.remove(requisicao);
        }
        
<<<<<<< HEAD
        public ArrayList <Item> getTopOne(int mes, int ano)
        {
            ArrayList <Item> top = new ArrayList();
            int max = 0;
            int[] contador = new int[this.itens.size()];
=======
        /**
         * Retorna os itens mais requisitados do mes e ano passados por parametro
         * @param mes
         * @param ano
         * @return 
         */
        public static ArrayList <Item> getTopOne(int mes, int ano)
        {
            ArrayList <Item> top = new ArrayList();
            int max = 0;
            int[] contador = new int[itens.size()];
>>>>>>> origin/master
            
            /**
             * Obtém o número de ocorrências dos itens
             */
<<<<<<< HEAD
            for(int i = 0; i < this.requisicoes.size(); i++)
            {
                Date data = this.requisicoes.get(i).getData();
                Item item = this.requisicoes.get(i).getItem();
                if(data.getYear() == ano)
                {
                    if(data.getMonth() == mes)
                    {
                        contador[this.itens.indexOf(item)] += 1;
=======
            for(int i = 0; i < requisicoes.size(); i++)
            {
                Date data = requisicoes.get(i).getData();
                Item item = requisicoes.get(i).getItem();
                if((data.getYear() + 1900) == ano)
                {
                    if((data.getMonth() + 1) == mes)
                    {
                        contador[itens.indexOf(item)] += 1;
>>>>>>> origin/master
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
<<<<<<< HEAD
                    top.add(this.itens.get(i));
=======
                    top.add(itens.get(i));
>>>>>>> origin/master
                }
            }        
            return top;
        }
<<<<<<< HEAD

	public Gestor() {
	}
        /**
         * Identifica os itens que nao foram requisitados no mes e ano inseridos
         * @param String mes
         * @param String ano
         * @return 
         */
        public ArrayList<Item> nReq(int mes, int ano)/*ATENCAO FUNCAO REPETIDA == NREQUISITADOS*/
        {
            ArrayList <Item> nreqs=new ArrayList() ;
            for(int i=0;i<this.itens.size();i++)
            {
                boolean ver=true;
                for(int j=0;j<this.requisicoes.size();j++)
                {
                    Date data=this.requisicoes.get(j).getData();
                    if((data.getMonth()==mes)&&(data.getYear()==ano))
                    {
                        if(this.itens.get(i).getNumero()==this.requisicoes.get(j).getItem().getNumero())
                        {
                            ver=false;
                            break;
                        }
                    }
                }
                if(ver==true)
                    {
                        nreqs.add(this.itens.get(i));
                    }
            }
            return nreqs;
        }
        /*public ArrayList<Item> reqMomento(String dia, String mes, String ano)
        {
            ArrayList <Item> nreqs=new ArrayList() ;
            for()
            return nreqs;
        }*/
        
        


=======
        
        

>>>>>>> origin/master
        
        /**
         * Metodo que Procura a existência de requisicoes e devolve array caso nao encontre nenhuma, no mes do ano inseridos
         * @param mes
         * @param ano
         * @return 
         */
<<<<<<< HEAD
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
=======
	public static ArrayList <Item> nRequesitados(int mes, int ano)
        {
            ArrayList <Item> nre=new ArrayList ();
            for(int i = 0; i < itens.size(); i++)
            {
                boolean ver = false;
                for(int j = 0; j < requisicoes.size();j++)
                {
                    Date dt = requisicoes.get(j).getData();
                    if((dt.getMonth()==mes)&&(dt.getYear()==ano)&&(itens.get(i)==requisicoes.get(j).getItem()))
>>>>>>> origin/master
                    {
                        ver=true;
                        break;
                    }
                }
                if(ver==false)
<<<<<<< HEAD
                    nre.add(this.itens.get(i));
            }
            return nre;
        }
=======
                    nre.add(itens.get(i));
            }
            return nre;
        }
        
>>>>>>> origin/master
         /**
         * Este metodo devolve num arraylist todos os itens que apresentam uma data de entrega nula
         * @return 
         */
<<<<<<< HEAD
        public ArrayList<Item> itensRequisitados()
        {
            ArrayList <Item> item=new ArrayList();
            boolean d=true;
            for(int i=0;i<this.requisicoes.size();i++)
            {
                if(this.requisicoes.get(i).getDataEnt()==null)
                {
                    if(d==true)
                    {
                        item.add(this.requisicoes.get(i).getItem());
                        d=false;
                    }
                    else
                    {
                        for(int j=0;j<item.size();j++)
                        {
                            if(item.get(j).getNumero()==this.requisicoes.get(i).getItem().getNumero())
                                break;
                            if(j==item.size()-1)
                                item.add(this.requisicoes.get(i).getItem());
                        }
                    }
                }
            }
            return item;
        }
=======
        public static ArrayList<Item> itensRequisitados()
        {
            ArrayList <Item> item=new ArrayList();
            for(int i=0;i<requisicoes.size();i++)
            {
                if(requisicoes.get(i).getDataEnt()==null)
                    item.add(requisicoes.get(i).getItem());
            }
            return item;
        }
        
>>>>>>> origin/master
         /**
         * Este metodo retorna num arraulist todos os itens atrasados
         * @param livro /Recebe como parametro de entrada o indicador se pretende listar livros (true) ou dvds (false)
         * @param data/ Refere se a data acutal
         * @return 
         */
<<<<<<< HEAD
        public ArrayList <Item> itensAtrasados(boolean livro)
        {
            Date dt= new Date ();
            System.out.println(dt.getDay()+" "+dt.getMonth()+" "+dt.getYear());
            ArrayList <Item> res=new ArrayList();
            for(int i=0;i<this.requisicoes.size();i++)
            {
                if(((livro==true)&&(this.requisicoes.get(i).getItem().getClass().getName().equals("biblioteca.Livro")))||((livro==false)&&(this.requisicoes.get(i).getItem().getClass().getName().equals("biblioteca.Dvd"))))
                {
                    System.out.println("CENA ");
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
=======
        public static ArrayList <Item> itensAtrasados(boolean livro)
        {
            Date dt= new Date ();
            ArrayList <Item> res=new ArrayList();
            for(int i=0;i<requisicoes.size();i++)
            {
                if(((livro==true)&&(requisicoes.get(i).getItem().getClass().getName().equals("Livro")))||((livro==false)&&(requisicoes.get(i).getItem().getClass().getName().equals("Dvd"))))
                {
                    if((requisicoes.get(i).getUtilizador().getTipo()==1)&&(requisicoes.get(i).getDataEnt()==null))
                    {
                        if(dt.compareTo(somaData(requisicoes.get(i).getData(),5))>0)/*NUMERO MAGICO A SER ALTERADO*/
                                {
                                    res.add(requisicoes.get(i).getItem());
                                }
                    }
                    else if(requisicoes.get(i).getUtilizador().getTipo()==2&&(requisicoes.get(i).getDataEnt()==null))
                    {
                        if(dt.compareTo(somaData(requisicoes.get(i).getData(),92))>0)/*NUMERO MAGICO A SER ALTERADO*/
                                {
                                    res.add(requisicoes.get(i).getItem());
>>>>>>> origin/master
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
<<<<<<< HEAD
        public Date somaData(Date data, int dias)
=======
        public static Date somaData(Date data, int dias)
>>>>>>> origin/master
        {
            Calendar cal = Calendar.getInstance();    
            cal.set(Calendar.DAY_OF_MONTH, data.getDay());
            cal.set(Calendar.MONTH, data.getMonth());
            cal.set(Calendar.YEAR, data.getYear());   
            cal.add(Calendar.DAY_OF_MONTH, dias);
<<<<<<< HEAD
            Date tal=new Date(cal.get(1)-1900,cal.get(2)-1,cal.get(5));
            System.out.println("Ano: "+(tal.getYear()+1900)+"Mes "+(tal.getMonth()+1)+"Dia "+tal.getDay());
            return new Date(cal.get(1)-1900,cal.get(2),cal.get(5));
        }
=======
            return new Date(cal.get(1)-1900,cal.get(2)-1,cal.get(5));
        }
        
>>>>>>> origin/master
         /**
         * Numero médio de requisicoes e numero maximo de reqeuisicoes
         * @param mes
         * @return 
         */
<<<<<<< HEAD
        public void estatistica(int mes, int ano)
=======
        public static void estatistica(int mes, int ano)
>>>>>>> origin/master
        {
            int diamax=0;
            int reqdiamax=0;
            int somarequisicoes=0;
            for(int i=1;i<31;i++)
            {
                int reqdia=0;
<<<<<<< HEAD
                for(int j=0;j<this.requisicoes.size();j++)
                {
                    if((this.requisicoes.get(j).getData().getMonth()==mes)&&(this.requisicoes.get(j).getData().getYear()==ano))
=======
                for(int j=0;j<requisicoes.size();j++)
                {
                    if((requisicoes.get(j).getData().getMonth()==mes)&&(requisicoes.get(j).getData().getYear()==ano))
>>>>>>> origin/master
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
