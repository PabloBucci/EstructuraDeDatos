/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

/**
 *
 * @author educacionit
 */
public class Pila <T>{
    private final int max;
    private T[] elementos;
    private int tope = -1;
    
    public Pila (int max){
        this.max = max;
        elementos = (T[]) new Object[max];
    }
    
    public boolean estaVacia(){
        return (tope < 0);
    }
    
    public void empujar ( T e) throws PilaLlenaException {
        if ((this.max - 1) == tope){
            throw new PilaLlenaException("Pila llena");
        }else{
            elementos[++tope] = e;
        }
    }
    
    public T sacar () throws PilaVaciaException{
        T e = null;
        if(this.estaVacia()){
            throw new PilaVaciaException ("Pila vacía");
        }else{
            e = elementos[tope];
            elementos[tope--] = null;
        }
        return e;
    }
    
    public void listar (){
        for(int i = this.tope; i >= 0; i--){
            System.out.println(elementos[i]);
        }
    }
}
