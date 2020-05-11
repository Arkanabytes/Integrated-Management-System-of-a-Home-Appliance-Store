package principal;

public class Musica extends Producto {

	// Attributes
	private String genero;

	// Constructors
	public Musica() {
	}

	public Musica(String nombre, double precioUnit, int cantStock,
			boolean disponible, String genero) {
		super(nombre, precioUnit, cantStock, disponible);
		this.genero = genero;
	}

	// Methods
	@Override
	public String toString() {
		return "ARTÍCULO DE MÚSICA\n" + super.toString() + "Género: "
				+ this.genero;
	}

	// Gets and Sets
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
