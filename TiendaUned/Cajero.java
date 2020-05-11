
/**
 * Write a description of class Caja here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (21_04_2018)
 */
import java.lang.*;


    /**
 * Write a description of class Caja here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (21_04_2018)
 */
public class Cajero extends Empleado
{

    private Producto productos[] = null;//productos lo dejo en modo vacio 
    private double cajero;//Datos para que funcione el cajero
    private boolean Cliente;//datos de compra del cliente

	// Constructors
	public Cajero(Producto[] productos,double cajero, boolean Cliente, double sueldoBase, int horasExtras, double tipoIRPF, 
                char casado, int numeroHijos, String nombre, String apellidos, String dni, char sexo, int edad, String direccion, 
                int telefono) {

        super(sueldoBase, horasExtras, tipoIRPF, casado, numeroHijos, nombre, apellidos, dni, sexo, edad, direccion, telefono);
        this.cajero = cajero;
        this.Cliente = Cliente;
	}

    // Methods
    public Producto[] cargarProductos() {
        return productos;
    }

	public void mostrarProductos(Producto[] productos) {
		for (int i = 0; i < productos.length; i++) {
			System.out.print(productos[i] + "\n-------\n");
		}
	}

	public void mostrarNombreProductos(Producto[] productos) {
		for (int i = 0; i < productos.length; i++) {
			System.out.println(i + 1 + " " + productos[i].getNombre() + "\n");
		}
		System.out.println("\n------------\n");
	}

	public double comprarProducto(Producto[] productos, int num,
			int cantidadUnidades) {
		if (productos[num - 1].isDisponible()) {
			if (productos[num - 1].getCantStock() >= cantidadUnidades) {
				System.out.println("La compra se ha realizado con éxito!!\n");
				productos[num - 1].setCantStock(productos[num - 1]
						.getCantStock() - cantidadUnidades);
				return cajero+= cantidadUnidades
						* productos[num - 1].getPrecioUnit();
			} else {
				System.out.println("No hay cantidad suficiente de producto");
			}
		} else {
			System.out.println("No hay cantidad suficiente de producto");
		}
		return cajero;
	}

	public double mostrarCaja() {
		System.out.print("El total de la caja es ");
		cajero = Math.round(cajero* 100);
		return cajero / 100;
	}
}

