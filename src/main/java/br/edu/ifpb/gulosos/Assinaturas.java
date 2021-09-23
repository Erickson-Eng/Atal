package br.edu.ifpb.gulosos;

import java.util.*;

public class Assinaturas {
    public static void main(String[] args) {

        List<Vizinho> horarios = new ArrayList<>();
        Vizinho a = new Vizinho(4,7);
        Vizinho b = new Vizinho(1,3);
        Vizinho c = new Vizinho(2,5);
        Vizinho d = new Vizinho(5, 6);

        horarios = Arrays.asList(a,b,c,d);

        Collections.sort(horarios);

        List<Integer> visitas = new ArrayList<>();

        int  i = 0;


        while (i < horarios.size()) {
            int horario_fim = horarios.get(i).fim;

            int controle = horario_fim;

            i++;

            while (i < horarios.size()) {
                if (horarios.get(i).inicio > horario_fim){
                    break;
                }
                controle = Math.min(controle, horarios.get(i).fim);

                i++;
            }

            visitas.add(controle);
        }




        int totalVizitas = visitas.size();
        System.out.println(totalVizitas);
        visitas.forEach(System.out::println);

    }

}
