/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosaicos3celdas;

/**
 *
 * @author CltControl
 */
public class Point {
    
private int posX;
private int posY;
public int valor;

public Point(int valor,int posX,int posY){
    this.valor=valor;
    this.posX= posX;
    this.posY = posY;
}

public int getPosX() {
        return posX;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

public void setPosX(int posX) {
        this.posX = posX;
    }

public int getPosY() {
        return posY;
    }

public void setPosY(int posY) {
        this.posY = posY;
    }


}
