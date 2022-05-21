/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.discretas_proyecto;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class Discretas_Proyecto {
    JFrame frame;
    public Discretas_Proyecto(){
    frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(Color.orange);
    frame.getContentPane().setLayout(null);
    frame.setSize(1000,600);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }
    public static void main(String[] a) {
        Discretas_Proyecto n=new Discretas_Proyecto();
    }
    
}
