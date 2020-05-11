
/**
 * Write a description of class Proyector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyector extends Imagen {
     private String ID;
     private float distProyeccion;
     private float luminosidad;
     private byte numAltavoces;
     private boolean cuatrok;
     private int Usb;
     private double precio;
     
     public Proyector (int pulgadasPantalla,String resolucion,int frecuencia,String tecnologiaImagen){
           super (pulgadasPantalla,resolucion,frecuencia,tecnologiaImagen);
 }

   // public Proyector(String ID, float distProyeccion, float luminosidad, float frecuencia, byte numAltavoces, boolean cuatrok, int Usb, double precio) 
    {
        this.ID = ID;
        this.distProyeccion = distProyeccion;
        this.luminosidad = luminosidad;
        this.numAltavoces = numAltavoces;
        this.cuatrok = cuatrok;
        this.Usb = Usb;
        this.precio = precio;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setDistProyeccion(float distProyeccion) {
        this.distProyeccion = distProyeccion;
    }

    public void setLuminosidad(float luminosidad) {
        this.luminosidad = luminosidad;
    }
    public void setNumAltavoces(byte numAltavoces) {
        this.numAltavoces = numAltavoces;
    }

    public void setCuatrok(boolean cuatrok) {
        this.cuatrok = cuatrok;
    }

    public void setUsb(int Usb) {
        this.Usb = Usb;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public float getDistProyeccion() {
        return distProyeccion;
    }

    public float getLuminosidad() {
        return luminosidad;
    }

    public byte getNumAltavoces() {
        return numAltavoces;
    }

    public boolean getCuatrok() {
        return cuatrok;
    }

    public int getUsb() {
        return Usb;
    }

    public double getPrecio() {
        return precio;
    }
   public void MostrarDatos ()
    {
        System.out.println ("Proyector ID: "+ID+
                 "\nPulgadas Pantalla: "+getPulgadasPantalla()+
                 "\nResolucion pantalla: "+getResolucion()+
                 "\nFrecuencia: "+getFrecuencia()+
                 "\nTecnologiaImagen: "+getTecnologiaImagen()+
                 "\nDistancia proeccion: "+distProyeccion+
                 "\nLuminosidad "+luminosidad+
                 "\nIncorporado altavos: "+numAltavoces+
                 "\nReproduce en 4k: "+cuatrok+
                 "\nNumeros de Usb: "+Usb+
                 "\nPrecio de Proyector: "+precio);
    }

}

 