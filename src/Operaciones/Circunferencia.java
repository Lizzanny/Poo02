/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Circunferencia {
    private Scanner sc = new Scanner(System.in);
    private float radio;

    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        this.setRadio(sc.nextFloat());
    }
    
    public float area(){
        float areax;
        areax = (float) (Math.PI * Math.pow(this.radio, 2));
        return areax;
    }
    
    public float perimetro(){
        float perimetrox;
        perimetrox = (float)(2 * Math.PI * this.radio);
        return perimetrox;
    }
    
}
