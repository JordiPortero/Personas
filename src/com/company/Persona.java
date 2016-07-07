package com.company;

import java.util.*;

public class Persona implements Comparable<Persona> {




        private String nombre;
        private Long id;
        private String dni;
        private Integer edad;


        public Persona(String nombre, Long id, String dni, Integer edad) {
            this.id = id;
            this.dni = dni;
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }



    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int compareTo(Persona otraPersona){
        if(this.edad>otraPersona.edad){
            return 1;
        }
        else if(this.edad<otraPersona.edad){
            return  -1;
        }
        else{
            return  0;
        }

    }
}












