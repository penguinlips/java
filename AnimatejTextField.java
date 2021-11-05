/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagename;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AnimatejTextField {
    public static void main(){
        
    String hello="Hello";
    String temp = "";
    for(int i=0;i<hello.length();i++){
        
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(AnimatejTextField.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String convert =  String.valueOf(hello.charAt(i));
        temp = temp+convert;
        jTextField1.setText(temp);
        jTextField1.update(jTextField1.getGraphics());
        
    }
    
    }
};