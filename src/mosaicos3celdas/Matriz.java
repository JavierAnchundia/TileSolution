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
public class Matriz {
    
Point Matriz [][];
int tamanoMatriz;


public Matriz(int tamanoMatriz){
this.tamanoMatriz=tamanoMatriz;
this.Matriz = new Point [tamanoMatriz][tamanoMatriz];
}
    public Point[][] getMatriz() {
        return Matriz;
    }

    public void setMatriz(Point[][] Matriz) {
        this.Matriz = Matriz;
    }

   void rellenarMatriz(){
    for(int i=0; i< this.Matriz.length;i++){
       for(int j=0;j< this.Matriz.length;j++){
         this.Matriz[i][j]= new Point(0,i,j);   
       }
    }
   }
   
   void llenarUno(int posX, int posY){
       (this.Matriz[posX][posY]).setValor(1);
   }
   
   void llenarCero(int posX, int posY){
       (this.Matriz[posX][posY]).setValor(0);
   }
     public void Tile(int tamanoMatriz, Point p){
   
       Tile(tamanoMatriz,p,0,0);
   }
     
  private void Tile(int tamanoMatriz,Point p,int posInicioX , int posInicioY){
       
       int posIX = posInicioX;
       int posIY = posInicioY;
       if(tamanoMatriz ==1) return;
       
       //If para comparar si esta en la esquina superior izquierda
       if(!((p.getPosX()<=(posInicioX +(tamanoMatriz/2-1)) && p.getPosX()>=posInicioX )
                                               && 
               (p.getPosY()<=(posInicioY+ (tamanoMatriz/2-1))) && p.getPosY()>=(posInicioY))){
           
           llenarUno(posInicioX +(tamanoMatriz/2-1),posInicioY+ (tamanoMatriz/2-1));
           Tile(tamanoMatriz/2,Matriz[posInicioX +(tamanoMatriz/2-1)][posInicioY+ (tamanoMatriz/2-1)],posInicioX,posInicioY);

       }
       
       else{
         Tile(tamanoMatriz/2,p,posInicioX,posInicioY);
       }
              //If para comparar si esta en la esquina inferior izquierda
       if(!((p.getPosX()>=(posInicioX+tamanoMatriz/2)&& p.getPosX()<=tamanoMatriz-1) 
                                               &&
               (p.getPosY()<=(posInicioY+ (tamanoMatriz/2-1))) && p.getPosY()>=(posInicioY))){
           llenarUno(posInicioX + tamanoMatriz/2, posInicioY+(tamanoMatriz/2-1));
           Tile(tamanoMatriz/2,Matriz[posInicioX + tamanoMatriz/2][posInicioY+(tamanoMatriz/2-1)],posInicioX+tamanoMatriz/2,posInicioY);

       }
       else{          
           Tile(tamanoMatriz/2,p,posInicioX+tamanoMatriz/2,posInicioY);
           }
       
        //If para comparar si esta en la esquina superior derecha

       if(!((p.getPosX()<=(posInicioX+(tamanoMatriz/2-1)) && p.getPosX()>=posInicioX)
                                          && 
              (p.getPosY()>= posInicioY+(tamanoMatriz/2) && p.getPosY()<= tamanoMatriz-1))){
           llenarUno(posInicioX+(tamanoMatriz/2-1),posInicioY+tamanoMatriz/2);
           Tile(tamanoMatriz/2,Matriz[posInicioX+(tamanoMatriz/2-1)][posInicioY+tamanoMatriz/2],posInicioX,posInicioY+tamanoMatriz/2);
       }
       else{
          Tile(tamanoMatriz/2,p,posInicioX,posInicioY+tamanoMatriz/2);

       }
        //If para comparar si esta en la esquina inferior derecha

       if(!((p.getPosX()>=(posInicioX+tamanoMatriz/2) && p.getPosX() <= tamanoMatriz-1) 
                                          && 
               (p.getPosY()>= posInicioY+(tamanoMatriz/2) && p.getPosY()<= tamanoMatriz-1))){
           llenarUno(posInicioX+tamanoMatriz/2,posInicioY+tamanoMatriz/2);
           Tile(tamanoMatriz/2,Matriz[posInicioX+tamanoMatriz/2][posInicioY+tamanoMatriz/2],posInicioX+tamanoMatriz/2,posInicioY+tamanoMatriz/2);  
       }
         
       else{
           Tile(tamanoMatriz/2,p,posInicioX+tamanoMatriz/2,posInicioY+tamanoMatriz/2);  

       }
   }
  


    @Override
    public String toString() {
        String cadena = "";
        for(int i=0; i< this.Matriz.length;i++){
            for(int j=0;j< this.Matriz.length;j++){
                cadena = cadena + " "+ Integer.toString((this.Matriz[i][j]).getValor());   
            }
            cadena = cadena +"\n";
        }
        return cadena;
    }
   
}
