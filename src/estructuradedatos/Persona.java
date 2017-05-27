/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import java.util.Objects;

/**
 *
 * @author educacionit
 */
public class Persona implements Comparable <Persona>{
    private Integer dni;
    private String nombre;

    public Persona(String nombre, String dni) {
        this.dni = Integer.parseInt(dni);
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = Integer.parseInt(dni);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public Integer getDni() {
        return this.dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    public int compareTo (Persona otraPersona){
        return this.dni.compareTo(otraPersona.dni);
    }
}
