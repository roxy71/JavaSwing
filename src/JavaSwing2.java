/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing2;
import graficas.*;
import javax.swing.*;
import java.awt.*
        
/**
 *
 * @author LAB03
 */
public class JavaSwing2 extends JFrame
{
    JPanel mipanel;//Creacion de objeto JPanel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton; 
    
      public JavaSwing2()
      {
          
           mipanel = new JPanel();//Creamos el objeto
        milabel = new JLabel();
        mitexto = new JTextField(20);//20 son los caracteres
        miboton = new JButton();
          
      }
              
}
