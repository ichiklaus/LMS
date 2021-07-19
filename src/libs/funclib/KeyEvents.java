/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs.funclib;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Nicolas
 */
public class KeyEvents{
    
    
    public void onlyNumeric(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
            if (!(Character.isDigit(c)) || c == (KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE){
                evt.consume();
            }
    }
    public void onlyAlphabetic(java.awt.event.KeyEvent evt){
        //boolean dot = false;
        char c = evt.getKeyChar();
        if ((Character.isAlphabetic(c)) || c == (KeyEvent.VK_BACKSPACE) || c == (KeyEvent.VK_DELETE) || c == (KeyEvent.VK_DECIMAL)){
            evt.consume();
        }
    }
}
