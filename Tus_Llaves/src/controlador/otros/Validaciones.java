/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.otros;

import controlador.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Validaciones {
    
    public void Decimales(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() <= 57 && evt.getKeyChar() >= 48) {

                } else {
                    if (evt.getKeyChar() == 8 || evt.getKeyChar()==46) {

                    } else {
                        JOptionPane.showMessageDialog(null, "SOLO PUEDE INGRESAR NÚMEROS");
                        evt.consume();
                    }
                }
            }
    
    public void letras(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() <= 122 && evt.getKeyChar() >= 97 ) {

                } else {
                    if (evt.getKeyChar() == 8  || evt.getKeyChar() ==32) {

                    } else {
                        if(evt.getKeyChar() <= 90 && evt.getKeyChar() >= 65){
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "SOLO PUEDE INGRESAR LETRAS");
                            evt.consume();
                        }
                        
                    }
                }
            }
    
    public void Numeros(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() <= 57 && evt.getKeyChar() >= 48) {

                } else {
                    if (evt.getKeyChar() == 8) {

                    } else {
                        JOptionPane.showMessageDialog(null, "SOLO PUEDE INGRESAR NÚMEROS");
                        evt.consume();
                    }
                }
            }
}
