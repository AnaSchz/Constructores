/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

/**
 *
 * @author Alumno
 */
public class Circ {
    String color = "";
    int radio = 0;
    int diametro = 0;
    double area = 0;
    double perimetro = 0;
    
    Circ(String color, int radio){
        this.color = color;
        this.radio = radio;
        this.diametro = 2*radio;
    }
    
    Circ(int radio){
        this.area = 3.14*radio*radio;
    }
    
    Circ(int radio, String color){
       this.perimetro = 2*3.14*radio;
    }
    
    Circ(double area, double perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }
    
    Circ (String color, double area, int radio){
        this.color = color;
        this.area = area;
    }
}