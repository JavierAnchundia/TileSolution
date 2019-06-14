/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosaicos3celdas;

import java.util.Scanner;

/**
 *
 * @author CltControl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int tamanoMatriz = 1;
    Matriz matriz;
    int celdaFaltanteX;
    int celdaFaltanteY;
    
    System.out.println ("Ingrese el tamaño de la matriz nxn: ");
    Scanner entradaEscaner = new Scanner (System.in);
    tamanoMatriz = Integer.parseInt(entradaEscaner.nextLine ());
    matriz = new Matriz(tamanoMatriz);
    matriz.rellenarMatriz();
    
    System.out.println ("Ingrese la coordenada X de la celda faltante: ");
    celdaFaltanteX = Integer.parseInt(entradaEscaner.nextLine ());
    System.out.println ("Ingrese la coordenada Y de la celda faltante: ");
    celdaFaltanteY = Integer.parseInt(entradaEscaner.nextLine ());
    
    System.out.println ("\n");
    
    matriz.llenarUno(celdaFaltanteX, celdaFaltanteY);
    matriz.Tile(matriz.tamanoMatriz,matriz.Matriz[celdaFaltanteX][celdaFaltanteY]);
    matriz.llenarCero(celdaFaltanteX, celdaFaltanteY);
    System.out.println (matriz);

    

    } 

     
   
}
