package br.edu.ifpb.dinamicos;

import br.edu.ifpb.dinamicos.Corte.CorteDeHaste;

public class MainCorte {

    public static void main(String[] args) {
        int[] haste = new int[]{1, 5, 8, 9, 10, 17, 17, 20};

        int size = haste.length;
        long inicio = System.currentTimeMillis();
        System.out.println("Maximum Obtainable Value is " +
                CorteDeHaste.cutRod(haste, size));
        long fim = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (fim - inicio)/1000d);

//        long inicio2 = System.currentTimeMillis();
//        System.out.println("Maximum Obtainable Value is " +
//                CorteDeHasteRecursivo.cutRod(haste, size));
//        long fim2 = System.currentTimeMillis();
//        System.out.println();
//        System.out.printf("%.3f ms%n", (fim2 - inicio2)/1000d);
    }
}
