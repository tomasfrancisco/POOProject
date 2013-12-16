/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Joel
 */
public class Autor {
    private String nome;
    private int numero;
    private String datanasc;
    Autor(String nome,int numero,String datanasc)
    {
        this.nome=nome;
        this.numero=numero;
        this.datanasc=datanasc;
    }
    public String getNome()
    {
        return this.nome;
    }
    public int getNumero()
    {
        return this.numero;
    }
    public String getDataNasc()
    {
        return this.datanasc;
    }
    public void setNome(String n)
    {
        this.nome=n;
    }
    public void setNumero(int numero)
    {
        this.numero=numero;
    }
    public void setDataNasc(String DN)
    {
        this.datanasc=DN;
    }
}
