/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tomas
 */
public class DataGestor {
    
    /**
     * Adiciona dias úteis a um calendário
     * @param cal
     * @param limite
     * @return 
     */
    static Calendar getDataLimite(Calendar cal, int limite)
    {
        Date data = cal.getTime();
        Calendar final_cal = Calendar.getInstance();
        
        int dia_semana = data.getDay();
        int dia = data.getDate();        
        int mes = data.getMonth();
        int ano = data.getYear() + 1900;
        
        int horas = 23;
        int minutos = 59;
        
        while(limite > 0)
        {
            dia += 7;
            limite -= 5;
        }
        
        final_cal.set(ano, mes, dia, horas, minutos);       
        
        return final_cal;
    }
    
    /**
     * Devolve a String no formato "dia da semana, dia de mes de ano às horas:minutosh"
     * @param cal
     * @return 
     */
    static String getData(Calendar cal)
    {
        Date data = cal.getTime();
        
        int dia_semana = data.getDay();
        int dia = data.getDate();        
        int mes = data.getMonth();
        int ano = data.getYear();
        
        int horas = data.getHours();
        int minutos = data.getMinutes();
        
        String string_data = getDiaSemana(dia_semana) + ", " + dia + " de " + getMesAno(mes) + " de " + getAno(ano) + " às " + horas + ":" + minutos + "h";  
        return string_data;
        
    }
    
    static int getAno(int ano)
    {
        return (ano + 1900);
    }
    
    /**
     * Devolde a String do dia da semana correspondente ao dia da semana na classe Date
     * @param dia_semana
     * @return 
     */
    static String getDiaSemana(int dia_semana)
    {
        String dia;
        
        switch(dia_semana)
        {
            case 0:
                dia = "Domingo";
                break;
            case 1:
                dia = "Segunda-feira";
                break;
            case 2:
                dia = "Terça-feira";
                break;
            case 3:
                dia = "Quarta-feira";
                break;
            case 4:
                dia = "Quinta-feira";
                break;
            case 5:
                dia = "Sexta-feira";
                break;
            case 6:
                dia = "Sábado";
                break;
            default:
                dia = "Dia da Semana Inválido";
                break;               
        }
        return dia;
    }
    
    /**
     * Devolve a String com o nome em português do mês do ano correspondente ao mes na classe Date
     * @param mes
     * @return 
     */
    static String getMesAno(int mes)
    {
        String string_mes;
        
        switch(mes)
        {
            case 0:
                string_mes = "Janeiro";
                break;
            case 1:
                string_mes = "Fevereiro";
                break;
            case 2:
                string_mes = "Março";
                break;
            case 3:
                string_mes = "Abril";
                break;
            case 4:
                string_mes = "Maio";
                break;
            case 5:
                string_mes = "Junho";
                break;
            case 6:
                string_mes = "Julho";
                break;                
            case 7:
                string_mes = "Agosto";
                break;
            case 8:
                string_mes = "Setembro";
                break;
            case 9:
                string_mes = "Outubro";
                break;
            case 10:
                string_mes = "Novembro";
                break;
            case 11:
                string_mes = "Dezembro";
                break;
            default:
                string_mes = "Mês Inválido";
                break;               
        }
        return string_mes;
    }
}
