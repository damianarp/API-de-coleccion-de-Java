package com.damianarp.ejemplo.set;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        // Creamos una instancia HashSet a partir de la interface genérica Set.
        // Tal cual lo hacíamos con el ArrayList desde la interface genérica List: List<String> al = new ArrayList<>();
        Set<String> hs = new HashSet<>();

        // Agregamos elementos al Set.
        hs.add("uno"); // System.out.println(hs.add("uno")); retorna true
        hs.add("dos"); // System.out.println(hs.add("dos")); retorna true
        hs.add("tres"); // System.out.println(hs.add("tres")); retorna true
        hs.add("cuatro"); // System.out.println(hs.add("cuatro")); retorna true
        hs.add("cinco"); // System.out.println(hs.add("cinco")); retorna true

        // Imprimimos el Set
        System.out.println(hs); // Salida: [cinco, uno, dos, tres, cuatro] // No mantiene un orden natural, a diferencia de List.

        // Agregamos un elemento repetido al Set.
        hs.add("tres");

        // el método add() retorna un boolean.
        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados?: " + b); // false

        // Imprimimos nuevamente el Set.
        System.out.println(hs); // Salida: [cinco, uno, dos, tres, cuatro] // No se agrega el elemento repetido, ya que el Set no permite esto, a diferencia de List.
    }
}
