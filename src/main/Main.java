/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.ViewCalculadora;
import models.ModelCalculadora;
import controllers.ControllerCalculadora;
/**
 *llama los componentes de otros packege para su ejecucion en conjunto
 * @author Edgar
 */
public class Main {
    private static ViewCalculadora viewCalculadora;
    private static ModelCalculadora modelCalculadora;
    private static ControllerCalculadora controllerCalculadora;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        viewCalculadora = new ViewCalculadora();
        modelCalculadora = new ModelCalculadora();
        controllerCalculadora = new ControllerCalculadora(viewCalculadora, modelCalculadora);
    
    }
}
