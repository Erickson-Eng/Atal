package br.edu.ifpb.gulosos;

public class Vizinho implements Comparable<Vizinho>{
    public Integer inicio;
    public Integer fim;


    public Vizinho(Integer inicio, Integer fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public int compareTo(Vizinho obj) {
        return this.inicio - obj.inicio == 0 ?
                this.fim - obj.fim :
                this.inicio - obj.inicio;
    }
}