package gt.edu.miumg.parcial1;

public class PizzaNuevaYork extends Pizza {
    private String estiloCorte;

    public PizzaNuevaYork(String nombre, String tamano, double precio, String estiloCorte) {
        super("Pizza Nueva York", tamano, precio);
        this.estiloCorte = estiloCorte;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza estilo Nueva York con corte " + estiloCorte);
    }

    @Override
    public String toString() {
        return "PizzaNuevaYork{" +
                "estiloCorte='" + estiloCorte + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
