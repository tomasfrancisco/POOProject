package biblioteca;

import java.util.*;

class Livro extends Item{
    private String isbn;
    private ArrayList <Autor> autores=new ArrayList();
    private String cota;
    
    Livro(String titulo, int ano, String editora, String isbn, String cota, int numero)
    {
        super.editora=editora;
        super.titulo=titulo;
        super.ano=ano;
        this.isbn=isbn;
        this.cota=cota;
        super.numero = numero;
    }
   public String getIsbn()
   {
       return this.isbn;
   }
   public String getCota()
   {
       return this.cota;
   }
   public ArrayList getAutor()
   {
       return this.autores;
   }
   public void setAutor(Autor x)
   {
       this.autores.add(x);
   }
   public void setIsbn(String x)
   {
       this.isbn=x;
   }
   public void setcota( String x)
   {
       this.cota=x;
   }
}