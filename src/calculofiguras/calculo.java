/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofiguras;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author estudiantes
 */
public class calculo {
    double lado;
    double base;
    double area;
    double perimetro;  
    private static DecimalFormat df2 = new DecimalFormat("0.00");
    
    public void setLado(Double lado){
        this.lado = lado;
    }
    public Double getLado(){
        return this.lado;
    }
    public void setBase(Double base){
        this.base = base;
    }
    public Double getBase(){
        return this.base;
    }
    public void setarea(Double area){
        this.area = area;
    }
    public Double getarea(){
        return this.area;
    }     
    public void setperim(Double perimetro){
        this.perimetro = perimetro;
    }
    public Double getperim(){
        return this.perimetro;
    } 
    
    
    public static double cuadrado_area(double lado){
        double area = lado*lado;    
        df2.setRoundingMode(RoundingMode.UP);
        df2.format(area);
        return area;
    }
    public static double cuadrado_perimetro(double lado){
        double perimetro = lado*4;  
        df2.setRoundingMode(RoundingMode.UP);
        df2.format(perimetro);
        return perimetro;
    }
    
    public static double circulo_area(double lado){
        double area = 3.14 * lado * lado;
        df2.setRoundingMode(RoundingMode.UP);
        df2.format(area);
        return area;
    }
    public static double circulo_perimetro(double lado){
        double perimetro = 2 * 3.14 * lado;
        df2.setRoundingMode(RoundingMode.UP);
        df2.format(perimetro);
        System.out.print(perimetro);
        return perimetro;
    }
    
    public static double rectangulo_area(double lado, double base){
        double area = lado*base;
        df2.format(area);
        return area;
    }
    public static double rectangulo_perimetro(double lado, double base){
        double perimetro = (2*lado)+(2*base);
        df2.setRoundingMode(RoundingMode.UP);
        df2.format(perimetro);
        return perimetro;
    }
    
    public static double triangulo_area(double lado){
        double alt_tri = (Math.pow(3,1.0/2.0)*lado)/2;
        double area = (lado*alt_tri)/2;
        df2.setRoundingMode(RoundingMode.UP);
        df2.format(area);
        return area;
    }
    public static double triangulo_perimetro(double lado){
        double perimetro = lado*3;
        df2.setRoundingMode(RoundingMode.UP);
        df2.format(perimetro);
        return perimetro;
    }
      
}
