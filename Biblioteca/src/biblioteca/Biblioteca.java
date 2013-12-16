/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

import java.util.*;

/**
 *
 * @author tomas
 */
public class Biblioteca {
    
        protected static final int ALUNO = 1;
        protected static final int PROF = 2;
        protected static final int ADMIN = 3;
        protected static final int ERRO = -1;
    
    
    public static void main(String[] args) 
    {
        
        Gestor biblioteca = new Gestor();
        ArrayList <Utilizador> user = new ArrayList();
        
        Utilizador tomas = new Leitor("Tomás Francisco", "Paul", "968158474", "mail@tomasfrancisco.com", "15/05/1994", "tfrancisco", "tomas1994", ALUNO);
        Item livro = new Livro("Titulo", 2000, "Editora", "20192019201910", "PL6", 1);
        Requisicao req1 = new Requisicao(livro, tomas, 2013, 12, 23, 1); 
        
        
        
        biblioteca.setUtilizador(tomas);
        biblioteca.setItem(livro);
        biblioteca.setRequisicao(req1);
        
        
        user = biblioteca.getUtilizador("Tomás Francisco");
        
        for(int i = 0; i < user.size(); i++)
        {
            System.out.println(user.get(i).getNome());
            System.out.println(user.get(i).getData_nascimento());
        }
        
        ArrayList <Item> top = new ArrayList();
        
        top = biblioteca.getTopOne(12, 2013);
        
        for(int i = 0; i < top.size(); i++)
        {
            System.out.println(top.get(i).getTitulo());
            System.out.println(top.get(i).getEditora());
            System.out.println(top.get(i).getAno());
        }
        
        
        
        
    }
}
