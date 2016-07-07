package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, List>mapPersona = new HashMap<>();

    }
}

class Persona {

    private Long id;
    private String dni;
    private String nombre;
    private Integer edad;


    public Persona(Long id, String dni, String nombre, Integer edad) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni(String dni) {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "id " + id + " dni " + dni + " nombre " + nombre + " edad " + edad + "";
    }
}


