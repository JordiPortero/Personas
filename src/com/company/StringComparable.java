package com.company;

/**
 * Created by professor on 29/06/2016.
 */
public class StringComparable {
    public static void main(String[] args) {
        String oscar = "Oscar";
        String judith = "Judith";
        int resultado = oscar.compareTo(judith);
        System.out.println(resultado);

        Integer x=1;
        Integer y=1;

        System.out.println(x.compareTo(y));


        Persona ivan=new Persona("ivan", 1L, "45212547G", 22);
        Persona marcos=new Persona("Marcos", 2L, "5241258L", 23);
        System.out.println(ivan.compareTo(marcos));

    }


}
