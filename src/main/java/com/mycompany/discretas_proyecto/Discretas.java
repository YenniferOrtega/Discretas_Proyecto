package com.mycompany.discretas_proyecto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Discretas extends JFrame {
    public static <T> Consumer<T> withCounterx(BiConsumer<Integer, T> consumer) {
        AtomicInteger counter = new AtomicInteger(0);
        return item -> consumer.accept(counter.getAndIncrement(), item);
    }
    public static <T> Consumer<T> withCountery(BiConsumer<Integer, T> consumer) {
        AtomicInteger contador = new AtomicInteger(0);
        return item -> consumer.accept(contador.getAndIncrement(), item);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //Grafica g2 = new Grafica();
        System.out.println("Proyecto M. Discretas");
     
        Scanner entrada1 = new Scanner(System.in);
        boolean Vision = true, VisionAristas = true;
        int Opcion, OpAris, CantAristas, NumVerti, v1, v2, conexion;
        
        JOptionPane.showMessageDialog(null,"Se le solicitara el numero de vertices que desea,"+
                "\n"+" este a su vez sera el numero de filas y columnas"
                +"\n"+"de la matriz, a continuacion se le presentara un"+
                "\n"+"menu de opciones, con las cuales podra interactuar"+
                "\n"+"con la matriz, recuerde ingresar el numero de aristas.");

        System.out.println("Ingrese el numero de vertices del grafo: ");
        NumVerti = entrada1.nextInt();
        int[][] arreglo = new int[NumVerti][NumVerti];
        Grafos_1 g = new Grafos_1(NumVerti, arreglo, "");
        while (Vision) {
            VisionAristas = true;
            System.out.println("MENÚ DE INICIO");
            System.out.println("1. Generar matriz de manera aleatoria");
            System.out.println("2. Dar los valores a la matriz");
            System.out.println("3. Determinar las aristas");
            System.out.println("4. Ver el grafo");
            System.out.println("5. Ver Matriz de Adyacencia");
            System.out.println("6. Probar relaciones de orden y propiedades");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción: ");
            Opcion = entrada1.nextInt();
            switch (Opcion) {
                case 1:
                    Arrays.stream(arreglo).forEach(withCounterx((i, filas)->{
                        Consumer<Object> action = withCountery((j, value) -> arreglo[i][j] = (int)(Math.random()*2+0));
                        for (int columna : filas) {
                            action.accept(columna);
                        }
                    }));
                    break;
                case 2:
                    AtomicInteger valor = new AtomicInteger();
                    Arrays.stream(arreglo).forEach(withCounterx((i, filas)->{
                        Consumer<Object> action = withCountery((j, value) -> {
                            System.out.println("Ingrese el valor de la relacion ["+i+"]"+" ["+j+"] ");
                            valor.set(entrada1.nextInt());
                            while (valor.get() >1 || valor.get() <0){
                                System.out.println("Valor incorrecto validos 1 o 0");
                                System.out.println("Ingrese el valor de la relacion ["+i+"]"+" ["+j+"] ");
                                valor.set(entrada1.nextInt());
                            }
                            arreglo[i][j] = valor.get();
                        });
                        for (int columna : filas) {
                            action.accept(columna);
                        }
                    }));
                    break;
                case 3:
                    while (VisionAristas) {
                        System.out.println("MENÚ ARISTAS");
                        System.out.println("1. Ingresar Arista");
                        System.out.println("2. Salir al menú principal");
                        OpAris = entrada1.nextInt();
                        switch (OpAris) {
                            case 1 -> {
                                System.out.println("Ingrese el primer vertice que desea crear una arista (0-" + (NumVerti - 1) + ")");
                                v1 = entrada1.nextInt();
                                System.out.println("Ingrese el segundo vertice que desea crear una arista (0-" + (NumVerti - 1) + ")");
                                v2 = entrada1.nextInt();
                                System.out.println("Conexión 0->Nada, 1->Conexion");
                                conexion = entrada1.nextInt();
                                g.LlenarMatriz(v1, v2, conexion);
                            }
                            case 2 -> VisionAristas = false;
                        }
                    }
                    break;
                case 4:
                    Grafos_1 g2 = new Grafos_1(NumVerti, arreglo);
                    break;
                case 5:
                    System.out.println("--Matriz de Adyacencia--");
                    g.ImprimirMatriz();
                    break;
                case 6:
                    Propiedades propiedades = new Propiedades();
                    if (propiedades.reflexiva(arreglo)){
                        System.out.println("La matriz es reflexiva");
                    }else{
                        System.out.println("La matriz no es reflexiva");
                    }
                    if (propiedades.irreflexiva(arreglo)){
                        System.out.println("La matriz es irreflexiva");
                    }else{
                        System.out.println("La matriz no es irreflexiva");
                    }
                    if (propiedades.simetria(arreglo)){
                        System.out.println("La matriz es simetrica");
                    }else{
                        System.out.println("La matriz no es simetrica");
                    }
                    if (propiedades.asimetria(arreglo)){
                        System.out.println("La matriz es asimetrica");
                    }else{
                        System.out.println("La matriz no es asimetrica");
                    }
                    if (propiedades.antisimetria(arreglo)){
                        System.out.println("La matriz es antisimetrica");
                    }else{
                        System.out.println("La matriz no es antisimetrica");
                    }
                    if (propiedades.transitiva(arreglo)){
                        System.out.println("La matriz es transitiva");
                    }else{
                        System.out.println("La matriz no es transtiva");
                    }
                    if (propiedades.reflexiva(arreglo) && propiedades.antisimetria(arreglo) && propiedades.transitiva(arreglo)){
                        System.out.println("Relacion de orden parcial");
                    }
                    if (propiedades.asimetria(arreglo) && propiedades.transitiva(arreglo)){
                        System.out.println("Relacion de orden estricto");
                    }
                    break;
                case 7:
                    Vision = false;
                    System.out.println("Por:"+"\n"+"Carlos Andres Dueñas Barreto"+"\n"+"Yennifer Soled Ortega Ocampo");
                    break;
            }
        }
    }

}
