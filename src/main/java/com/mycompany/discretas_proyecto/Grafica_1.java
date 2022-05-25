package com.mycompany.discretas_proyecto;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Grafica_1 extends JFrame{
    private int vert;
    
    public Grafica_1(){
        super("Grafo generado");
        //setSize(1100, 700);
        setSize(1366, 720);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    

    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D circulo = (Graphics2D) g;
        //Grafos g1 = new Grafos(1);
        //if(g1.getVertices()==1){
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(683, 360, 100, 100);
            circulo.drawString("V1", 683, 360);
        //}
        // circulo.drawString("V1" , (int)107.5, 350);
        // circulo.drawLine(75, (int) 207.5, (int)107.5, 350);
    }

}
