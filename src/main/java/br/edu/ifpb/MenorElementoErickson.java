package br.edu.ifpb;

public class MenorElementoErickson {

    public int buscaPrimeiroElementoFaltante(int array[], int primeiroElemento, int ultimoElemento)
    {
        if (primeiroElemento > ultimoElemento)
            return ultimoElemento + 1;

        if (primeiroElemento != array[primeiroElemento])
            return primeiroElemento;

        int meio = (primeiroElemento + ultimoElemento) / 2;

        // Left half has all elements from 0 to mid
        if (array[meio] == meio)
            return buscaPrimeiroElementoFaltante(array, meio+1, ultimoElemento);

        return buscaPrimeiroElementoFaltante(array, primeiroElemento, meio);
    }

    // Driver program to test the above function
    public static void main(String[] args)
    {
        MenorElementoErickson menorElemento = new MenorElementoErickson();
        int arr[]  = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        int arr2[] = {1, 2, 3, 4, 6, 9, 11, 15};
        int n = arr.length;
        int b = arr2.length;
        System.out.println("O menor elemento faltante é : "
                + menorElemento.buscaPrimeiroElementoFaltante(arr, 0, n - 1));
        System.out.println("O menor elemento faltante é : "
                + menorElemento.buscaPrimeiroElementoFaltante(arr2, 0, b - 1));
    }
}
