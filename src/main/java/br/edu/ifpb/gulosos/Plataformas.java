package br.edu.ifpb.gulosos;

import java.util.Arrays;

public class Plataformas {
    public static int findMinPlatforms(double[] chegada, double[] embarque)
    {
        Arrays.sort(chegada);
        Arrays.sort(embarque);
        int contador = 0;
        int plataformas = 0;
        int i = 0, j = 0;
        while (i < chegada.length)
        {
            if (chegada[i] < embarque[j])
            {
                plataformas = Integer.max(plataformas, ++contador);
                i++;
            }
            else {
                contador--;
                j++;
            }
        }

        return plataformas;
    }

    public static void main(String[] args)
    {
        double[] chegada = { 2.00, 2.10, 3.00, 3.20, 3.50, 5.00 };
        double[] embarque = { 2.30, 3.40, 3.20, 4.30, 4.00, 5.20 };

        System.out.print("Quantidade de trens minima para chegar ao destino: "+ findMinPlatforms(chegada, embarque));
    }
}

