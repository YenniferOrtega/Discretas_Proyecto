package com.mycompany.discretas_proyecto;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Grafos_1 extends JFrame {

    private int[][] arreglo;
    private int vertices;
    private String dato;

    //CONSTRUCTOR PARA SETEAR
    public Grafos_1(int v, int[][] a, String d) {
        this.vertices = v;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 0;
            }
        }
        this.arreglo = a;
        this.dato = d;
    }

    //COSTRUCTOR ENCARGADO DE GENERAR LA INTERFAZ GRAFICA
    public Grafos_1(int v, int[][] a) {
        super("Grafo generado");
        setSize(1280, 720);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.vertices = v;
        this.arreglo = a;
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D circulo = (Graphics2D) g;
        //System.out.println("Cantidad de Vertices: " + vertices);
        if (vertices == 1) {
            int aleX = NumeroAleatorioX();
            int aleY = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX, aleY, 100, 100);
            circulo.drawString("V0", aleX, aleY);
        } else if (vertices == 2) {
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("V0", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("V1", aleX2, aleY2);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
        } else if (vertices == 3) {
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("V0", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("V1", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("V2", aleX3, aleY3);
            
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
        } else if (vertices == 4) {
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("V0", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("V1", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("V2", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("V3", aleX4, aleY4);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
        }else if(vertices==5){
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            int aleX5 = NumeroAleatorioX();
            int aleY5 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("V0", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("V1", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("V2", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("V3", aleX4, aleY4);
            //Circulo 4
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX5, aleY5, 100, 100);
            circulo.drawString("V4", aleX5, aleY5);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
            if(arreglo[4][0] == 1 || arreglo[0][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX1+50, aleY1+50);
            }
            if(arreglo[4][1] == 1 || arreglo[1][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX2+50, aleY2+50);
            }
            if(arreglo[4][2] == 1 || arreglo[2][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX3+50, aleY3+50);
            }
            if(arreglo[4][3] == 1 || arreglo[3][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX4+50, aleY4+50);
            }
        }
    }

    public void ImprimirMatriz() {
        for (int[] ints : arreglo) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public void LlenarMatriz(int Vertice1, int Vertice2, int valor) {
        arreglo[Vertice1][Vertice2] = valor;
    }

    public int NumeroAleatorioX() {
        int ale = 0;
        ale = (int) (Math.random() * 1366);
        return ale;
    }

    public int NumeroAleatorioY() {
        int ale = 0;
        ale = (int) (Math.random() * 720);
        return ale;
    }

    //Metodos Gets y Sets
    public int[][] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[][] arreglo) {
        this.arreglo = arreglo;
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }
}
