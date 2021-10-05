package br.edu.ifpb.dinamicos;

import br.edu.ifpb.dinamicos.LCS.LCSMemoizado;
import br.edu.ifpb.dinamicos.LCS.LCSRecursivo;
import br.edu.ifpb.dinamicos.LCS.LcsPD;

import java.util.Arrays;

public class MainLCS {

    public static void main(String[] args) {


        String s1 = "AGGTABGGATBAAXZZAAAA";
        String s2 = "GXTXAYBGGATBAAXYZAAAA";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        long inicio = System.currentTimeMillis();
        //Dinamico

        System.out.println("Length of LCS is" + " " +
                LcsPD.lcs(X, Y, m, n));

        long fim = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (fim - inicio)/1000d);


        //recursivo
        long inicio2 = System.currentTimeMillis();
        System.out.println("Length of LCS is" + " " +
                LCSRecursivo.lcs(X, Y, m, n));
//
        long fim2 = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (fim2 - inicio2)/1000d);

        // memoizado
        int maximum = 1000;
        int[][] dp = new int[m][maximum];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        long inicio3 = System.currentTimeMillis();
        System.out.println("Length of LCS: " + LCSMemoizado.lcs(s1, s2, m, n, dp));

        long fim3 = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (fim3 - inicio3)/1000d);
    }
}
