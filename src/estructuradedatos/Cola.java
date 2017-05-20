/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

/**
 *
 * @author Pablo
 */
public class Cola <T>{
    private final int max;
    private int primero;
    private int ultimo;
    private T[] elementos;
    
    public Cola(int max){
        this.max = max;
        ultimo = primero = -1;
        elementos = (T[]) new Object[max];
    }
    
    public boolean estaVacia(){
        return (primero < 0);
    }
    
    
    
}
