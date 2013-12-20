package biblioteca;

public class Item {
    protected double numero;
    protected String titulo;
    protected int ano;
    protected String editora;
    
    
    public String getTitulo()
    {
        return this.titulo;
    }
    public int getAno()
    {
        return this.ano;
    }
    public String getEditora()
    {
        return this.editora;
    }
    public double getNumero()
    {
        return this.numero;
    }
    public void setNumero(double x)
    {
        this.numero=x;
    }
    public void setTitulo(String x)
    {
        this.titulo=x;
    }
    public void setAno(int x)
    {
        this.ano=x;
    }
    public void setEditora(String x)
    {
        this.editora=x;
    }
}