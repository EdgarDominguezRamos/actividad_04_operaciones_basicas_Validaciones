/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *declaracion de variables, generar getters y setters
 * @author Edgar
 */
public class ModelCalculadora {
    private  String numero1= Float.toString(0.0f); 
    private  String numero2= Float.toString(0.0f); 
    private  String resultado = Float.toString(0.0f); 

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
