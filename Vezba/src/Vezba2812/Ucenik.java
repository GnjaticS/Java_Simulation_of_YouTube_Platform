package Vezba2812;

import java.util.ArrayList;

public class Ucenik {
    private int id;
    private int godine;
    private ArrayList<Integer> listaOcena;

    public Ucenik(int id, int godine, ArrayList<Integer> listaOcena) {
        this.id = id;
        this.godine = godine;
        this.listaOcena = listaOcena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    @Override
    public String toString() {
        return "Ucenik{" +
                "id=" + id +
                ", godine=" + godine +
                ", listaOcena=" + listaOcena +
                '}';
    }

    public double prosek () {
        double prosek = 0;
        for (int pivot: listaOcena){
            prosek += pivot;
        }
        prosek = prosek / listaOcena.size();

        return prosek;
    }

}
