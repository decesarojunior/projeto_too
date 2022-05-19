
package br.edu.ifsul.bcc.too.base.topico3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author telmo
 * Manipulacao de classes em java: https://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
 */
public class ConversoesDatas {
    
    private java.util.Date data_util_date;
    
    private java.sql.Date data_sql_date;
    
    private java.util.Calendar data_util_calendar;
    
    //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    private SimpleDateFormat formatadorData;
    
    ConversoesDatas(){
        
        //testesInicializacao();
        //testesImpressao();
        //testesConversao();
        testesComparacao();
        
    }
    
    private void testesComparacao(){
        
        //inicialização do tipo java.util.Calendar
        java.util.Calendar data_util_antes = java.util.Calendar.getInstance();
        
        //inicialização do tipo java.util.Date
        java.util.Calendar data_util_depois = java.util.Calendar.getInstance();
        
        //CompareTo: -1 se for menor, 0 se for igual e 1 se for maior (mais recente).
        System.out.println("CompareTo: "+data_util_depois.compareTo(data_util_antes));
    
       System.out.println("dif: " + (data_util_depois.getTimeInMillis() - data_util_antes.getTimeInMillis()));
       
       //SSS - Millisecond 
       formatadorData = new SimpleDateFormat("SSS");        
       
       data_util_date = new java.util.Date(data_util_depois.getTimeInMillis() - data_util_antes.getTimeInMillis());
       
       System.out.println("F: "+ formatadorData.format(data_util_date));
       
    }
    
    private void testesConversao(){
        
        data_util_calendar = java.util.Calendar.getInstance(new Locale("pt","BR"));
        
        System.out.println("data_util_calendar BR: " + data_util_calendar);
        
        data_util_calendar.set(java.util.Calendar.YEAR, 1989);
        
        System.out.println("Ano: "+ data_util_calendar.get(java.util.Calendar.YEAR));
        
        data_util_date = new java.util.Date();
        
        data_sql_date = new java.sql.Date(data_util_date.getTime());
        
        //conversao de java.sql.Date para java.util.Date
        
        data_util_date.setTime(data_sql_date.getTime());
        
        //conversao de java.util.Date para java.util.Calendar
        
        data_util_calendar.setTimeInMillis(data_util_date.getTime());
        
        //conversao de java.util.Calendar para java.util.Date
        
        data_util_date.setTime(data_util_calendar.getTimeInMillis());
        
        //conversao de java.util.Calendar para java.sql.Date
        
        data_sql_date = new java.sql.Date(data_util_calendar.getTimeInMillis());
        
        //conversao de java.sql.Date para java.util.Calendar
        
        data_util_calendar.setTimeInMillis(data_sql_date.getTime());
        
        
    }
    
    private void testesImpressao(){
        
        formatadorData = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");        
        
        try {
            
            System.out.println("Data atual: " + System.currentTimeMillis());
            
            
            data_util_date = new java.util.Date();
            data_util_date.setTime(formatadorData.parse("19/10/1999 14:30:22").getTime());
            System.out.println("Data java.util.Date        :" + data_util_date);                        
            System.out.println("Data java.util.Date format :" + formatadorData.format(data_util_date.getTime()));
                        
            data_util_calendar = java.util.Calendar.getInstance();
            data_util_calendar.setTimeInMillis(formatadorData.parse("02/08/1983 23:10:03").getTime());
            System.out.println("Data java.util.Calendar        :" + data_util_calendar);
            System.out.println("Data java.util.Calendar format :" + formatadorData.format(data_util_calendar.getTime()));
            
            
            formatadorData.applyPattern("E, d 'de' MMM 'de' YYY");
            
            System.out.println("Data java.util.Calendar format :" + formatadorData.format(data_util_calendar.getTime()));
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
    
    private void testesInicializacao(){
        
        //inicialização do tipo java.util.Date
        data_util_date = new java.util.Date();
        System.out.println("Data atual via java.util.Date :" + data_util_date);
        
        //inicialização do tipo java.util.Calendar
        data_util_calendar = java.util.Calendar.getInstance();
        System.out.println("Data atual via java.util.Calendar :" + data_util_calendar);
        
        //inicialização do tipo java.util.Calendar
        data_sql_date = new java.sql.Date(data_util_calendar.getTimeInMillis());
        //data_sql_date = new java.sql.Date(data_util_date.getTime());
        
        System.out.println("Data atual via java.sql.Date :" + data_sql_date);
        
        
    }
    
    public static void main(String args[]){
        new ConversoesDatas();
    }
    
}
