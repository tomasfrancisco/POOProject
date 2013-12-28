package biblioteca;

import java.util.*;

abstract class Gestor {

        private static final int ALUNO = 1;
        private static final int PROF = 2;
        private static final int ADMIN = 3;
        private static final int ERRO = -1;
        
        private static final ArrayList <Utilizador> utilizadores = new ArrayList();
        private static final ArrayList <Item> itens = new ArrayList();
        private static final ArrayList <Requisicao> requisicoes = new ArrayList();

        private static double numero_admin = 0;
        private static double numero_leitor = 0;
        private static double numero_requisicao = 0;
        private static double numero_item = 0;
        
        /**
         * 
         * @return 
         */
        
        public static ArrayList <Utilizador> getUtilizadores()
        {
                return utilizadores;
        }

        /**
         * Adiciona um utilizador à colecção
         * Retorna true caso seja adicionado com sucesso
         * @param utilizador
         */
        public static boolean setUtilizador(Utilizador utilizador) 
        {
            if((utilizador.getTipo() == ALUNO) || (utilizador.getTipo() == PROF))
            {
                utilizador.setNumero(numero_leitor);
                numero_leitor++;
            }
            else if(utilizador.getTipo() == ADMIN)
            {
                utilizador.setNumero(numero_admin);
                numero_admin++;
            }
            else
                return false;
                       
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
         * Retorna o utilizador registado com o endereço de email ou username passado por parametro
         * @param ocorre
         * @return 
         */
        public static Utilizador getUtilizador(String ocorre)
        {
            Utilizador utilizador;
            
            for(int i = 0; i < utilizadores.size(); i++)
            {
                if((utilizador = utilizadores.get(i)).getEmail().equals(ocorre))
                {
                    return utilizador;
                }
                else if((utilizador = utilizadores.get(i)).getUsername().equals(ocorre))
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
        public static ArrayList <Utilizador> getUtilizadorNomeTelefone(String ocorre)
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

        /**
         * Retorna o Item Pelo seu número
         * @param numero
         * @return 
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
        
        /**
         * Remove o item da ArrayList pelo numero
         * @param numero
         * @return 
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
        
        /**
         * Pesquisa o item no ArrayList pelo seu nome
         * @param nome 
         */
        public static void PesquisaItem(String nome)
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
        
        /**
         * Adiciona um item ao ArrayList de Itens
         * @param x 
         */
        public static void setItem(Item x)
        {
            x.setNumero(numero_item);
            numero_item++;
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
        public static boolean setRequisicao(Requisicao requisicao)
        {
            requisicao.setNumero(numero_requisicao);
            numero_requisicao++;
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
            
            /**
             * Obtém o número de ocorrências dos itens
             */
            for(int i = 0; i < requisicoes.size(); i++)
            {
                Date data = requisicoes.get(i).getData();
                Item item = requisicoes.get(i).getItem();
                if((data.getYear() + 1900) == ano)
                {
                    if((data.getMonth() + 1) == mes)
                    {
                        contador[itens.indexOf(item)] += 1;
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
                    top.add(itens.get(i));
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
                    {
                        ver=true;
                        break;
                    }
                }
                if(ver==false)
                    nre.add(itens.get(i));
            }
            return nre;
        }
        
        /**
         * Este metodo devolve num arraylist todos os itens que apresentam uma data de entrega nula
         * @return 
         */
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
        
       /**
         * Este metodo retorna num arraulist todos os itens atrasados
         * @param livro /Recebe como parametro de entrada o indicador se pretende listar livros (true) ou dvds (false)
         * @param data/ Refere se a data acutal
         * @return 
         */
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
        public static Date somaData(Date data, int dias)
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
        public static void estatistica(int mes, int ano)
        {
            int diamax=0;
            int reqdiamax=0;
            int somarequisicoes=0;
            for(int i=1;i<31;i++)
            {
                int reqdia=0;
                for(int j=0;j<requisicoes.size();j++)
                {
                    if((requisicoes.get(j).getData().getMonth()==mes)&&(requisicoes.get(j).getData().getYear()==ano))
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
        
        /**
         * Retorna true se o username verificado já existe na base de dados
         * @param user
         * @param telefone
         * @return 
         */
        public static boolean verificaUser(String user)
        {   
            for(int i=0;i<Gestor.getUtilizadores().size();i++)        
            {   
                if(Gestor.getUtilizadores().get(i).getUsername().equals(user))
                {
                     return true;
                }
            }
            return false;
        }
        
        /**
         * Retorna true se o telefone verificado já existe na base de dados
         * @param telefone
         * @return 
         */
        public static boolean verificaTelefone(String telefone)
        {
           for(int i=0;i<Gestor.getUtilizadores().size();i++)        
           {
               if(Gestor.getUtilizadores().get(i).getTelefone().equals(telefone))
               {
                   return true;
               }
           }
           return false;         
        }
         
        
        /**
         * Retorna true se o email verificado já existe na base de dados
         * @param email
         * @return 
         */
        public static boolean verificaEmail(String email)
        {
            for(int i=0;i<Gestor.getUtilizadores().size();i++)        
            {
                if(Gestor.getUtilizadores().get(i).getEmail().equals(email))
                    return true;
            }
            return false;
        } 
        
        public static boolean verificaPrimeiraVez(String email)
        {
            for(int i=0;i<Gestor.getUtilizadores().size();i++)        
            {
                if(Gestor.getUtilizadores().get(i).getUsername().equals("NULL"))
                    return true;
            }
            return false;
        }
}

