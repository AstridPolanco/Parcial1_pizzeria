//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import gt.edu.miumg.parcial1.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                // Crear ingredientes
                Masa masa = new Masa("Tradicional", 500);
                System.out.println("masa = " + masa);
                Salsa salsa = new Salsa("Tomate", 250);
                System.out.println("salsa = " + salsa);
                Queso queso = new Queso("Mozzarella", 300);
                System.out.println("queso = " + queso);

                // Crear pizzas
                PizzaNuevaYork pizzaNY = new PizzaNuevaYork("Hawaiana NY", "Grande", 45.50, "Triangular");
                System.out.println("pizzaNY = " + pizzaNY);
                PizzaChicago pizzaChicago = new PizzaChicago("Queso Chicago", "Mediana", 50.00, "Gruesa");
                System.out.println("pizzaChicago = " + pizzaChicago);

                // Crear sucursal
                Sucursal sucursalNY = new Sucursal("Pizzería NY", "123 Broadway, New York");
                System.out.println("sucursalNY = " + sucursalNY);

                // Agregar empleados, ingredientes y equipos a la sucursal
                Empleado empleado1 = new Empleado("Antonio Cardona", "Cocinero", 3000);
                System.out.println("empleado1 = " + empleado1);
                Equipo equipo1 = new Equipo("Horno", "encendido");
                System.out.println("equipo1 = " + equipo1);

                sucursalNY.agregarEmpleado(empleado1);
                sucursalNY.agregarIngrediente(masa);
                sucursalNY.agregarIngrediente(salsa);
                sucursalNY.agregarIngrediente(queso);
                sucursalNY.agregarEquipo(equipo1);
                sucursalNY.agregarEspecialidad(pizzaNY);

                // Usar métodos
                empleado1.trabajar();
                equipo1.encender();

                pizzaNY.preparar();
                pizzaNY.hornear();
                pizzaNY.cortar();
                pizzaNY.empacar();

                pizzaChicago.preparar();
                pizzaChicago.hornear();
                pizzaChicago.cortar();
                pizzaChicago.empacar();
    }
}