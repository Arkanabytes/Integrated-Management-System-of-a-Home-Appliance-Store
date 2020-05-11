
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Producto {

    private String getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

	// Attributes
	private String ID;
	private double precioUnit;
	private int cantStock;
	private boolean disponible = false;
	public int dimesionArray;
	// Constructors
	public Producto() {
	}

	public Producto(String nombre, double precioUnit, int cantStock,
			boolean disponible) {
		this.ID = ID;
		this.precioUnit = precioUnit;
		this.cantStock = cantStock;
		this.disponible = disponible;

		dimesionArray++;// variable la dimensión del array.
						
	}

	// Methods
	
    @Override
	public String toString() {
		return "ID: " + this.getID() + "\n" + "Precio unidad: "
				+ this.getPrecioUnit() + " €\n" + "En Stock: "
				+ this.getCantStock() + "\n";
	}

	// Get and Set
	public String getNombre() {
		return this.ID;
	}

	public void setNombre(String nombre) {
		this.ID= ID;
	}

	public double getPrecioUnit() {
		return this.precioUnit;
	}

	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}

	public int getCantStock() {
		return this.cantStock;
	}

	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}

	public boolean isDisponible() {
		if (getCantStock() > 0)
			this.disponible = true;
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

        

}
    

    



