/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author educacionit
 */
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Pila <String> p = new Pila<>(5);
            List <String> l = new List<>();  
            p.empujar("a");
            p.empujar("75");
            p.empujar("b");
            System.out.println(p.sacar());
            p.empujar("1500");
            p.empujar("f");
            p.empujar("f");
            System.out.println(p.sacar());
            System.out.println(p.sacar());
            System.out.println(p.sacar());
            System.out.println(p.sacar());
            System.out.println(p.sacar());
            System.out.println("");
            p.listar();
        }catch(PilaLlenaException e) {
            System.out.println("Excepcion de pila llena");
        }catch(PilaVaciaException e) {
            System.out.println("Excepcion de pila vacia");
        }  
    }
}
