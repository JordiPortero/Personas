package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by professor on 29/06/2016.
 */
public class OrdenarPersonas {

    public static void main(String[] args){
        Persona persona1 = new Persona("Jordi",1L, "45637095N",  25);
        Persona persona2 = new Persona("Marta",2L, "56321458A",  24);
        Persona persona3 = new Persona("Pol",3L, "42563958B",  26);
        Persona persona4 = new Persona("Xavi",4L, "54856325M", 50);
        Persona persona5 = new Persona("Laura",5L, "45862398S",  17);


        List<Persona> personaList= new ArrayList<>();

        personaList.add(persona1);
        personaList.add(persona2);
        personaList.add(persona3);
        personaList.add(persona4);
        personaList.add(persona5);

        for (Persona persona:personaList)
        {
            System.out.println(persona);
        }

        Collections.sort(personaList);

        System.out.println("Pesonas ordenadas por edad: ");

        for (Persona persona:personaList)
        {
            System.out.println(persona);
        }









    }





}
