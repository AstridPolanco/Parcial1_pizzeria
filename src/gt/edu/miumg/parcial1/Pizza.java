package gt.edu.miumg.parcial1;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String nombre;
    private String tamano;
    private double precio;
    protected List<Ingrediente> ingredientes = new ArrayList<>();

    public Pizza(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }
    public abstract void preparar();

    public void hornear(){
        System.out.println("Horneando " + nombre);
    }
    public void cortar() {
        System.out.println("Cortando " + nombre);
    }

    public void empacar() {
        System.out.println("Empacando " + nombre);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", tamano='" + tamano + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
