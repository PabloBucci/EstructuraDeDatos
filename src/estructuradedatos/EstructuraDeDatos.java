/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author educacionit
 */
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*try {
            // TODO code application logic here
            Pila <String> p = new Pila<>(5);
            //List <String> l = new List<>();  
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
            e.printStackTrace();
        }catch(PilaVaciaException e) {
         //   System.out.println("Excepcion de pila vacia");
        }  
        List<String> nombres = new LinkedList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Juan");
        System.out.println(nombres.size());
        for(String e: nombres){
            System.out.println(e);
        }
        System.out.println("");
        nombres.remove(0);
        System.out.println(nombres.get(0));
        System.out.println("");
        for(String e: nombres){
            System.out.println(e); 
        }
        
        Set<Persona> personas = new HashSet<>();
        SortedSet<Persona> personas = new TreeSet<Persona>();
        personas.add(new Persona("Juan","10"));
        personas.add(new Persona("Alvaro","15"));
        personas.add(new Persona("Pedro","11"));
        System.out.println(personas.size());
        for(Persona p: personas){
            System.out.println(p);
        }
        */
        Map<String,Persona> personasPorDNI =new HashMap();
        personasPorDNI.put("10", new Persona("Juan","10"));
        Persona p2 =new Persona("Pedro", "20");
        personasPorDNI.put("20", p2);
        
        for(Persona p: personasPorDNI.values()){
            System.out.println(p);
        }
        
        for(String k: personasPorDNI.keySet()){
            System.out.println(k + " : " + personasPorDNI.get(k));
        }
        
        for(Map.Entry<String,Persona> e: personasPorDNI.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
