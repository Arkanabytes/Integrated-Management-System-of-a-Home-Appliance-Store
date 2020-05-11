
/**
 * Write a description of class Fijo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fijo extends Telefonia {
 private String ID;
 private boolean Alarma;
 private boolean Conferencia;
 private boolean Reloj;
 private boolean Vibracion;
 private boolean Manoslibres;
 private int precio;
 
  public Fijo (boolean analogico,boolean digital,boolean ip,boolean controlLlamadas,
            boolean servicioEmergencia,boolean mensajeria,boolean desvios,boolean llamadasVd){
        super (analogico,digital,ip,controlLlamadas,servicioEmergencia,mensajeria,desvios,llamadasVd);
    }

   // public Fijo(String ID,boolean Alarma, boolean Conferencia, boolean Reloj, boolean Vibración, boolean Manoslibres,int precio)
   {
        this.ID = ID;
        this.Alarma = Alarma;
        this.Conferencia = Conferencia;
        this.Reloj = Reloj;
        this.Vibracion = Vibracion;
        this.Manoslibres = Manoslibres;
        this.precio=precio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isAlarma() {
        return Alarma;
    }

    public void setAlarma(boolean Alarma) {
        this.Alarma = Alarma;
    }

    public boolean isConferencia() {
        return Conferencia;
    }

    public void setConferencia(boolean Conferencia) {
        this.Conferencia = Conferencia;
    }

    public boolean isReloj() {
        return Reloj;
    }

    public void setReloj(boolean Reloj) {
        this.Reloj = Reloj;
    }

    public boolean isVibracion() {
        return Vibracion;
    }

    public void setVibración(boolean Vibracion) {
        this.Vibracion = Vibracion;
    }

    public boolean isManoslibres() {
        return Manoslibres;
    }

    public void setManoslibres(boolean Manoslibres) {
        this.Manoslibres = Manoslibres;
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
                 "\nLlamadas IP: "+getLlamadasVd()+
                 "\nDesvios: "+getDesvios()+
                 "\nAlarma: "+Alarma+
                 "\nModo Conerencia: "+Conferencia+
                 "\nContiene Reloj: "+Reloj+
                 "\nModo vibracion :"+Vibracion+
                 "\nManos Libres: "+Manoslibres+
                 "\nTelefono fijo precio: "+precio);
    }
   
}

