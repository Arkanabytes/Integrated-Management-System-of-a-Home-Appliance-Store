import java.util.Scanner;
/**
 * Write a description of class Lavadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Lavadora extends Hogar{
    // instance variables - replace the example below with your ow
	private String ID;
        private double capacidad;
	private int velocidadCentrifugado;
	private String sistema;

	public Lavadora(String Cocina, String Frigorificos, String CafeTe, String Lavadora, String Calefaccion, String Limpieza)
	{
		super (Cocina,Frigorificos,CafeTe,Lavadora,Calefaccion,Limpieza);
		setID(ID);
		setCapacidad(capacidad);
		setVelocidadCentrifugado(velocidadCentrifugado);
		setSistema(sistema);
	}
        public void setID(String ID){
               this.ID=ID;
            }
	public void setCapacidad(double cap) {
		this.capacidad = cap;
	}

	public void setVelocidadCentrifugado(int VelCentrifugado) {
		this.velocidadCentrifugado = VelCentrifugado;
	}

	public void setSistema(String sys) {
		this.sistema = sys;
	}

	// Getters
	public String tID(){
               return this.ID;
            }
	public double getCapacidad() {
		return this.capacidad;
	}
	public int getVelocidadCentrifugado() {
		return this.velocidadCentrifugado;
	}
	public String getSistema() {
		return this.sistema;
	}
	public void IncreaseCapacidad(double value) {
		setCapacidad(getCapacidad() + value);
	}
	public void IncreaseVelocidadCentrifugado(int value) {
		setVelocidadCentrifugado(getVelocidadCentrifugado() + value);
	}
	public void ChangeSistema(String newSys) {
		setSistema(newSys);
	}

	public String toString() {
		return ("Lavadora Descripciones:\n*****************************\n"
				+ super.toString()
				+ "Sistema: "
				+ getSistema()
				+ ".\nVelocidad Centrifugado: "
				+ getVelocidadCentrifugado()
				+ " rpm.\nCapacidad: "
				+ getCapacidad() + " kg.\n**********************\n\n");
	}

	
                public void add() {
		//super.add();
		Scanner input = new Scanner(System.in);
		double capacidad;
		int VelocidadCentrifugado;
		String sys;
		int numeroArticulo;
		System.out.print("Entra els sistema pls: ");
		sys = input.next();
		System.out.print("Entra la capacidad pls: ");
		capacidad = input.nextDouble();
		System.out.print("Entra la velocidad pls: ");
		VelocidadCentrifugado = input.nextInt();
		System.out.print("Entra numero articulo: ");
		//NumeroArticulo= input.next();
		 
                this.setID(ID);
		this.setCapacidad(capacidad);
		this.setVelocidadCentrifugado(velocidadCentrifugado);
		this.setSistema(sistema);
		//this.setNumeroArticulo(nArticulo);
	
	}

}

	
