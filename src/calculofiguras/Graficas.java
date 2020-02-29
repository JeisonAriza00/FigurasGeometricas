/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofiguras;

/**
 *
 * @author ageep
 */

import java.awt.Color;
import java.awt.Graphics;

public class Graficas {
    int ladog;
    int baseg;

    public void setLado(int ladog){
        this.ladog = ladog;
    }
    public int getLado(){
        return this.ladog;
    }
    public void setBase(int baseg){
        this.baseg = baseg;
    }
    public int getBase(){
        return this.baseg;
    }
    
    public static void CleanPanel(Graphics g){
        g.clearRect(0, 0, 5000, 5000);
    }
    
    
    public static void DibujarCuadrado(Graphics g, int ladog){     
        g.setColor (Color.BLUE);
        g.fillRect(50, 50, ladog, ladog);      
    }
  
    public static void DibujarRectangulo(Graphics g,int ladog,int baseg){   
        g.setColor (Color.GREEN);
        g.fillRect(50, 50, baseg, ladog);      
    }
    
    public static void DibujarCirculo(Graphics g, int ladog){    
        g.setColor (Color.ORANGE);
        int radio=ladog*2;
        g.fillOval(50, 50, radio, radio);       
    } 
   
    public static void DibujarTriangulo(Graphics g,int ladog){    
        g.setColor (Color.RED);            
        int [] vx1 = {(((100+ladog)-(ladog/2))/2)+(ladog/2), 100+ladog, ladog/2};
        int [] vy1 = {70-ladog, 70+ladog, 70+ladog};
        g.fillPolygon (vx1, vy1, 3);  
    } 
}