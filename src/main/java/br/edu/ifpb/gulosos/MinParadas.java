package br.edu.ifpb.gulosos;

public class MinParadas {

    /*
    * O carro inicia na posição 0, com tanque cheio, e pode fazer m km com um tanque cheio.
    *  Existe um conjunto de postos no caminho.
    *  Deve-se colocar -1 na saída caso seja impossível chegar no destino*/
    public static int minRefuelStops(int chegada, int kmMax, int[] postos) {
        int tamanhoVetor = postos.length;
        int consumo = 0;
        int passos = 0;
        int valor = kmMax;
        while (valor < chegada){
            if (consumo>= tamanhoVetor || postos[consumo]> valor){
                return -1;
            }
            while (consumo< tamanhoVetor-1 && postos[consumo+1]<=valor){
                consumo++;
            }
            passos++;
            valor = postos[consumo] + kmMax;
            consumo++;
        }
        return passos;
    }

    public static void main(String[] args) {
        int chegada = 950;
        int distanciaMax = 400;
        int[] postos = {200,375,550,750};

        System.out.println(minRefuelStops(chegada,distanciaMax,postos));

        int chegada2 = 10;
        int distanciaMax2 = 3;
        int[] postos2 = {1,2,5,9};
        System.out.println(minRefuelStops(chegada2,distanciaMax2,postos2));

    }

}
