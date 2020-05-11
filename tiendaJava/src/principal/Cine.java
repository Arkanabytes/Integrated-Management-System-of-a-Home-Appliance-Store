package principal;

public class Cine extends Producto {

	// Attribute
	private String director;

	// Constructor
	public Cine() {
	}

	public Cine(String nombre, double precioUnit, int cantStock,
			boolean disponible, String director) {
		super(nombre, precioUnit, cantStock, disponible);
		this.director = director;
	}

	// Methods
	@Override
	public String toString() {
		return "ARTÍCULO DE CINE\n" + super.toString() + "Director: "
				+ this.director;
	}

	// Gets and Sets
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
