package com.company;

import java.util.*;


public class ProgramaPrincipal {

   static List<Persona> personaList = new ArrayList<>();
    private static Map<Long, Persona> mapId = new HashMap<>();
    private static Map<String, Persona> mapDni = new HashMap<>();
    private static Map<Integer, Persona> mapEdad = new HashMap<>();
    private  static Map<String, Persona>mapNombre=new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        generaPersonas();
        // System.out.println(mapNombre.get("Laura"));
        consultarPersonas();




    }

    public static void generaPersonas() {


        Persona persona1 = new Persona("Jordi",1L, "45637095N",  25);
        mapNombre.put(persona1.getNombre(), persona1);
        mapId.put(persona1.getId(), persona1);
        mapDni.put(persona1.getDni(), persona1);
        mapEdad.put(persona1.getEdad(), persona1);

        Persona persona2 = new Persona("Marta",2L, "56321458A",  24);
        mapNombre.put(persona2.getNombre(), persona2);
        mapId.put(persona2.getId(), persona2);
        mapDni.put(persona2.getDni(), persona2);
        mapEdad.put(persona2.getEdad(), persona2);

        Persona persona3 = new Persona("Pol",3L, "42563958B",  26);
        mapNombre.put(persona3.getNombre(), persona3);
        mapId.put(persona3.getId(), persona3);
        mapDni.put(persona3.getDni(), persona3);
        mapEdad.put(persona3.getEdad(), persona3);

        Persona persona4 = new Persona("Xavi",4L, "54856325M", 50);
        mapNombre.put(persona4.getNombre(), persona4);
        mapId.put(persona4.getId(), persona4);
        mapDni.put(persona4.getDni(), persona4);
        mapEdad.put(persona4.getEdad(), persona4);

        Persona persona5 = new Persona("Laura",5L, "45862398S",  17);
        mapNombre.put(persona5.getNombre(), persona5);
        mapId.put(persona5.getId(), persona5);
        mapDni.put(persona5.getDni(), persona5);
        mapEdad.put(persona5.getEdad(), persona5);


    }


    public static void consultarPersonas() {
        Scanner sc = new Scanner(System.in);
        bucle:
        while (true) {
            System.out.println("");

            System.out.println("Indica el campo por el que vas a filtrar: ");
            System.out.println("1. Id");
            System.out.println("2. Nombre");
            System.out.println("3. Dni");
            System.out.println("4. Mostrar todas");
            System.out.println("5. Salir");
            int filtro = sc.nextInt();

            switch (filtro) {
                case 1:
                    System.out.println("Indica la id por la que vas a buscar");
                    Long num = sc.nextLong();
                    Persona personaid = mapId.get(num);
                    if (personaid != null) {
                        System.out.println(personaid);
                    } else {
                        System.out.println("El id introducido no existe");
                    }
                    break;
                case 2:
                    System.out.println("Indica el nombre que quieres buscar: ");
                    String nombre = sc.next();
                    Persona persona = mapNombre.get(nombre);
                    if (persona != null) {
                        System.out.println(persona);
                    } else {
                        System.out.println("El nombre introducido no existe");
                    }
                    break;
                case 3:
                    System.out.println("Indica el dni a buscar");
                    String nombre1 = sc.next();
                    Persona personadni = mapDni.get(nombre1);
                    if (personadni != null) {
                        System.out.println(personadni);
                    } else {
                        System.out.println("El dni introducido no existe");
                    }
                    break;
                case 4:
                    for (Long idPersona : mapId.keySet()) {
                        System.out.println("Id de la persona: " + idPersona);
                        Persona personaActual = mapId.get(idPersona);
                        System.out.println("La persona es: " + personaActual);
                    }

                    for (String nombrePersona : mapNombre.keySet()) {
                        System.out.println("Nombre de la persona: " + mapNombre);
                        Persona personaActual = mapNombre.get(nombrePersona);
                        System.out.println("La persona que buscas es: " + personaActual);
                    }
                    break;
                case 5:
                    break bucle;


            }

        }


    }

}


