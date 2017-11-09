package javaswing2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package JavaSwing2;
//import graficas.*;
import javax.swing.*;
import java.awt.*;
        
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
    JRadioButton radio;
    JCheckBox caja;
    
      public JavaSwing2()
      {
          
           mipanel = new JPanel();//Creamos el objeto
        milabel = new JLabel();
        mitexto = new JTextField(20);//20 son los caracteres
        miboton = new JButton();
        radio =  new JRadioButton();
        caja =   new JCheckBox();
          
        
        
        
           this.add(mipanel);//Agrego el JPanel al JFrame
        mipanel.add(milabel);//Agrego los elementos al JPanel
        mipanel.add(mitexto);
        mipanel.add(miboton); 
        mipanel.add(caja);
        mipanel.add(radio);
        
        milabel.setText("Nombre");
        miboton.setText("Enviar");
        mipanel.setBackground(Color.red);
        
        }
      }
              

