/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

import java.util.*;

<<<<<<< HEAD

=======
>>>>>>> origin/master
/**
 *
 * @author tomas
 */
public class Biblioteca {
    
        protected static final int ALUNO = 1;
        protected static final int PROF = 2;
        protected static final int ADMIN = 3;
        protected static final int ERRO = -1;
    
    
<<<<<<< HEAD
  public static void main(String[] args) {
        /*Gestor novo= new Gestor();
        novo.setUtilizador(new Leitor(3,"Ze","ali", "9229","@1000","deede", "ze19", "zezao",1));
        novo.setUtilizador(new Leitor(1,"Ana","ali", "9229","@1000","deede", "ana19", "ana",1));
        novo.setUtilizador(new Leitor(2,"Joao","ali", "9229","@1000","deede", "Jo19", "Jo",1));
        novo.setItem(new Livro(2332,"tete", 2013, "dl", 323232, "dsds"));
        novo.setItem(new Livro(2333,"Gil", 2013, "dl", 323232, "dsds"));
        novo.setItem(new Livro(2334,"Aventura do zé", 2013, "dl", 323232, "dsds"));
        novo.setItem(new Livro(2335,"JAVA", 2013, "dl", 323232, "dsds"));
        novo.setRequisicao(new Requisicao(novo.getItem(2332), novo.getUtilizador(3), 2013, 2, 5));
        novo.setRequisicao(new Requisicao(novo.getItem(2334), novo.getUtilizador(2), 2013, 2, 30));
        novo.setRequisicao(new Requisicao(novo.getItem(2334), novo.getUtilizador(2), 2013, 2, 23));
        ArrayList<Item> tal =novo.itensAtrasados(true);
        System.out.println(tal.get(2).getTitulo());*/
=======
    public static void main(String[] args) 
    {
        
        
        ArrayList <Utilizador> user;
        
        
        Utilizador tomas = new Leitor("Tomás Francisco", "Paul", "968158474", "mail@tomasfrancisco.com", "15/05/1994", "tfrancisco", "tomas1994", ALUNO);
        Item livro = new Livro("Titulo", 2000, "Editora", "20192019201910", "PL6", 1);
        Requisicao req1 = new Requisicao(livro, tomas, 2013, 12, 23, 1); 
       
        
        Gestor.setUtilizador(tomas);
        Gestor.setItem(livro);
        Gestor.setRequisicao(req1);
        
        
        user = Gestor.getUtilizador("Tomás Francisco");
        
        for(int i = 0; i < user.size(); i++)
        {
            System.out.println(user.get(i).getNome());
            System.out.println(user.get(i).getData_nascimento());
        }
        
        ArrayList <Item> top;
        
        top = Gestor.getTopOne(12, 2013);
        
        for(int i = 0; i < top.size(); i++)
        {
            System.out.println(top.get(i).getTitulo());
            System.out.println(top.get(i).getEditora());
            System.out.println(top.get(i).getAno());
        }
        
        
        
>>>>>>> origin/master
        
        }
        /**
         * 
         */
        public static void menu()
        {
            
        }
        /**
         * 
         */
        public static void verificarUtilizador(String username, String password,Gestor )
        {
            
        }
}
