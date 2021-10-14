package com.Generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Arreglo declarado multilinea:
        // String universidades[];
        // universidades = new. String[5]

        // Arreglo declarado en una linea:
        // Arreglo con valores añadidos:
        /*
	    String universidades[]
        universidades = new String[5]{"ITVH", "ULA", "ULA", "UAM", "UADM", "UNAM"};
        */
        /*
        universidades[0] = "ITVH";
        universidades[1] = "ULA";
        universidades[2] = "UAM";
        universidades[3] = "UADM";
        universidades[4] = "UNAM";
         */
       /*
        universidades[5] = "UPN";
        universidades[0] = "IPN";
        universidades[0] = "TESCO";
        */
        /*
        for( String universidad : universidades ) {
            System.out.println(universidad);
        }
         */

        System.out.println("--------------------------HashSet---------------------------");

        Set<String> frutas = new HashSet(4);
        // Caracteristicas principales de Set
        // No puede contener elementos duplicados
        // El orden de los elementos puede variar
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("--------------------------TreeSet----------------------------");

        Set<String> frutas2 = new TreeSet<>();
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");

        for (String fruta : frutas2) {
            System.out.println(fruta);
        }

        System.out.println("-------------------------LinkedHashSet-----------------------");

        Set <String> frutas3 = new LinkedHashSet<>(4);
        // Es un poco mas costosa que hashSet
        // Almacena los valores en orden de insercion
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");

        for (String fruta : frutas3) {
            System.out.println(fruta);
        }

        System.out.println("-------------------------ArrayList---------------------------");

        List<String> frutas4 = new ArrayList<>();
        // Lista que si admite lementos duplicados

        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        frutas4.add("Mango");

        for (String fruta : frutas4) {
            System.out.println(fruta);
        }

        System.out.println("----------------------Elemento ArrayList-------------------");

        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");

        System.out.println(frutas4.get(indice));

        System.out.println("----------------------Elemento LinkedList-------------------");

        List<String> frutas5 = new LinkedList<>();
        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        frutas5.add("Mango");

        for (String fruta : frutas5) {
            System.out.println(fruta);
        }

        System.out.println("----------------------Elemento Map-------------------");

        Map<Integer, String> universidades = new HashMap<Integer, String>();
        // Asocia claves con valores
        // No puede teenr claves repetidas
        // Solo puede tener un valor asociado a la clave

        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAEM");
        universidades.put(4, "UAM");
        universidades.put(5, "TESCO");

        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }

            System.out.println(universidades.get(3));


        /*
        System.out.println("------------------------Ángel Bryan------------------------");

        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
        */
    }
}
