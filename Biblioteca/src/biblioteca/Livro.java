package biblioteca;

import java.util.*;

class Livro extends Item{
    private int isbn;
    private ArrayList <Autor> autores=new ArrayList();
    private String cota;
    Livro(String titulo, int ano, String editora, int isbn, String cota)
    {
        super.editora=editora;
        super.titulo=titulo;
        super.ano=ano;
        this.isbn=isbn;
        this.cota=cota;
    }
   public int getIsbn()
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
   public void setIsbn( int x)
   {
       this.isbn=x;
   }
   public void setcota( String x)
   {
       this.cota=x;
   }
}