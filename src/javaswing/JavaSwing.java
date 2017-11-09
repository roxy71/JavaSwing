/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import javax.swing.*;
import java.awt.*;

import gui.JavaSwing2;
/**
 *
 * @author LAB03
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JavaSwing2 ventana = new JavaSwing2();//Creamos un objeto tipo JFrame
        ventana.setVisible(true);//Esta sentencia muestra la ventana
        ventana.setBounds(0, 0, 600, 800);//Le asignamos tamaño a la ventana
        ventana.setTitle("Mi primera aplicacion con ventanas");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia  cierra la ventana
    }
    }
    
}
