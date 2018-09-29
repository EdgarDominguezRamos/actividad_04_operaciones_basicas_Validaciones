/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;
import javax.swing.JOptionPane;

/**
 *Validar datos que no son correctos, devuelve un mensaje
 * @author Edgar
 */
public class DataValidation {
    /**
     * en caso de que el valor ingresado int
     * @param value
     * valor asignado
     * @return 
     */
    public int sring2Int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value); 
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor" );
            result = 0;
        }
        return result;
    }
    /**
     * en caso de que el valor ingresado no sea float
     * @param value
     * valor asignado
     * @return 
     */
    public int sring2Float(String value){
        int result = 0;
        try{
            result = (int) Float.parseFloat(value); 
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor" );
            result = 0;
        }
        return result;
    }
    /**
     * en caso de que el valor asignado no sea double
     * @param value
     * valor asignado
     * @return 
     */
    public int sring2Double(String value){
        int result = 0;
        try{
            result = (int) Double.parseDouble(value); 
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor" );
            result = 0;
        }
        return result;
    }
    
}