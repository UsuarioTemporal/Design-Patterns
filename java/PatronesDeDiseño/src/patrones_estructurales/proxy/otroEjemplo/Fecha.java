/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy.otroEjemplo;

import java.time.LocalDate;
import java.util.StringTokenizer;

/**
 *
 * @author User
 */
public class Fecha {
    private int year;
    private int month;
    private int day;

    public Fecha(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Fecha(String cadena) {
        StringTokenizer string=new StringTokenizer(cadena,"/");
        String dd = string.nextToken();
        String mm = string.nextToken();
        String yy = string.nextToken();
        
        year = Integer.parseInt(yy);
        day=Integer.parseInt(dd);
        month=Integer.parseInt(mm);
    }

    public Fecha() {
        LocalDate hoy =LocalDate.now();
        year=hoy.getYear();
        day=hoy.getDayOfMonth();
        month=hoy.getMonthValue();
    }

    @Override
    public String toString() {
        return "Fecha{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }
    
}
