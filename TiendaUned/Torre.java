import java.lang.*;
/**
 * Write a description of class Otorre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torre extends Informatica {
     String ID;
    //Procesador
    private int nucleos;
    String velDisc;
    //almacenamiento
    private int numDisco;
    private int capDisco;
    //Targeta grafica
    private boolean tarjGrafica;
    private double precio;
    
     public Torre(String capacidad, String memoriaRam, int procesador, 
             String bateria, String conectividad, String sistemaOperativo, String tecnologiaImagen, 
             int camaraDelantera, boolean camaraTrasera) {
     super (capacidad, memoriaRam,procesador, bateria,conectividad,sistemaOperativo,tecnologiaImagen,camaraDelantera,camaraTrasera);
     }

   // public Torre(String ID, int nucleos, String velDisc, int numDisco, int capDisco, boolean tarjGrafica, double precio) 
   {
        this.ID = ID;
        this.nucleos = nucleos;
        this.velDisc = velDisc;
        this.numDisco = numDisco;
        this.capDisco = capDisco;
        this.tarjGrafica = tarjGrafica;
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public String getVelDisc() {
        return velDisc;
    }

    public void setVelDisc(String velDisc) {
        this.velDisc = velDisc;
    }

    public int getNumDisco() {
        return numDisco;
    }

    public void setNumDisco(int numDisco) {
        this.numDisco = numDisco;
    }

    public int getCapDisco() {
        return capDisco;
    }

    public void setCapDisco(int capDisco) {
        this.capDisco = capDisco;
    }

    public boolean getTarjGrafica() {
        return tarjGrafica;
    }

    public void setTarjGrafica(boolean tarjGrafica) {
        this.tarjGrafica = tarjGrafica;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
 void displayComputer()
    {
        System.out.println("Computer ID: " + getID());
        System.out.println("Procesador: " + getNucleos());
        System.out.println("Velocidad disco: " + getVelDisc());
        System.out.println("Num discos: " + getNumDisco());
        System.out.println("Capacidad disco: " + getCapDisco());
        System.out.println("Targeta grafica: " + getTarjGrafica());
        System.out.println("Precio: " + getPrecio());
    }
}


