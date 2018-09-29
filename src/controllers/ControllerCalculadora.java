/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelCalculadora;
import views.ViewCalculadora;
import extras.DataValidation;

/**
 *
 * @author Edgar
 */
public class ControllerCalculadora implements ActionListener {
    ModelCalculadora modelCalculadora;
    ViewCalculadora viewCalculadora;
    DataValidation dataValidation = new DataValidation();
    /**
     * llama los componentes necesarios para la ejecucion del programa
     * @param viewCalculadora
     * llama a el jframa
     * @param modelCalculadora 
     * llama a java class model para su ejecucion
     */
    public ControllerCalculadora(ViewCalculadora viewCalculadora, ModelCalculadora modelCalculadora){
        this.viewCalculadora = viewCalculadora;
        this.modelCalculadora = modelCalculadora;
        viewCalculadora.jb_suma.addActionListener(this);
        viewCalculadora.jb_resta.addActionListener(this);
        viewCalculadora.jb_multiplicacion.addActionListener(this);
        viewCalculadora.jb_division.addActionListener(this);
        viewCalculadora.jb_modulo.addActionListener(this);
        initComponents();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewCalculadora.jb_suma){
            suma();
        }   
        else if (e.getSource()==viewCalculadora.jb_resta){
            resta();
        }
        else if (e.getSource()==viewCalculadora.jb_multiplicacion){
            multiplicacion();
        }
        else if (e.getSource()==viewCalculadora.jb_division){
            division();
        }
        else if (e.getSource()==viewCalculadora.jb_modulo){
            residuo();
        }
    }
    /**
     * Se invoca este metodo en caso de que la operacion requerida sea una suma
     */
    public void suma(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = (numero1 )+ (numero2);
        modelCalculadora.setResultado(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El resultado de la suma es: " + (resultado));
    }
    /**
     * Se invoca este metodo en caso de que la operacion requerida sea una resta
     */
    public void resta(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = numero1 - numero2;
        modelCalculadora.setResultado(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El resultado de la suma es: " + (resultado));
    }
    /**
     * Se invoca este metodo en caso de que la operacion requerida sea una multiplicacion
     */
    public void multiplicacion(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = numero1 * numero2;
        modelCalculadora.setResultado(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El resultado de la suma es: " + (resultado));
    }
    /**
     * Se invoca este metodo en caso de que la operacion requerida sea una division
     */
    public void division(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
    
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = numero1 / numero2;
        modelCalculadora.setResultado(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El resultado de la suma es: " + (resultado));
    }
    /**
     * Se invoca este metodo en caso de que la operacion requerida sea un modulo
     */
    public void residuo(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = numero1 % numero2;
        modelCalculadora.setResultado(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El resultado de la suma es: " + (resultado));
    }
    public final void initComponents(){
        viewCalculadora.setVisible(true);
        viewCalculadora.jl_message.setText(modelCalculadora.getResultado());
    }
}