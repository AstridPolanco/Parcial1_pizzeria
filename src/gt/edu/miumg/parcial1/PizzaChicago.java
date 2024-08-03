package gt.edu.miumg.parcial1;

public class PizzaChicago extends Pizza{
    private String grosorMasa;

    public PizzaChicago(String nombre, String tamano, double precio, String grosorMasa) {
        super("Pizza Chicago", tamano, precio);
        this.grosorMasa = grosorMasa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza estilo Chicago con masa de grosor " + grosorMasa);
    }

    @Override
    public String toString() {
        return "PizzaChicago{" +
                "grosorMasa='" + grosorMasa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
