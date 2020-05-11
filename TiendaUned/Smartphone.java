
/**
 * Write a description of class Smartphone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smartphone extends Telefonia {
     private String ID;
    //SISTEMA OPERATIVO
    private double nucleos;
    private double ram;
    //ALMACENAMIENTO
    private double almacenamientoInt;
    private boolean camara;
    private boolean camaraTrasera;
    private double precio;
    
    public Smartphone (boolean analogico,boolean digital,boolean ip,boolean controlLlamadas,
            boolean servicioEmergencia,boolean mensajeria,boolean desvios,boolean llamadasVd){
        super (analogico,digital,ip,controlLlamadas,servicioEmergencia,mensajeria,desvios,llamadasVd);
    }
  
   /* public Smartphone(String ID, double nucleos, double ram, double almacenamientoInt, boolean camara, boolean camaraTrasera,
                      double precio) */
        {
        this.ID = ID;
        this.nucleos = nucleos;
        this.ram = ram;
        this.almacenamientoInt = almacenamientoInt;
        this.camara = camara;
        this.camaraTrasera = camaraTrasera;
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getNucleos() {
        return nucleos;
    }

    public void setNucleos(double nucleos) {
        this.nucleos = nucleos;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getAlmacenamientoInt() {
        return almacenamientoInt;
    }

    public void setAlmacenamientoInt(double almacenamientoInt) {
        this.almacenamientoInt = almacenamientoInt;
    }

    public boolean getCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public boolean getCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(boolean camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void MostrarDatos ()
    {
        System.out.println ("Smartphone ID: "+ID+
                 "\nTipo Sistema: "+getAnalogico()+
                 "\nTipo Sistema: "+getDigital()+
                 "\nSistema IP (tlf.domestico): "+getIp()+
                 "\nControl de llamadas (tlf.domestico): "+getControlLlamadas()+
                 "\nServicio Emergencia (tlf.domestico): "+getServicioEmergencia()+
                 "\nMensajeria (tlf.domestico): "+getMensajeria()+
                 "\nDesvios: "+getDesvios()+
                 "\nDesvios: "+getLlamadasVd()+
                 "\nDesvios: "+getDesvios()+
                 "\nMemoria Ram: "+nucleos+
                 "\nAlmacenamiento interno: "+almacenamientoInt+
                 "\nCamara delantera: "+camara+
                 "\nCamaraTrasera: "+camaraTrasera+
                 "\nPrecio de Smartphone: "+precio);
    }
}


