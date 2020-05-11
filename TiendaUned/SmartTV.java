import java.util.Scanner;
/**
 * Write a description of class SmartTv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmartTV extends Imagen {
    private String ID;
    private boolean Certificado;
    private String SistemaOperativo;
    private boolean Wifi;
    private boolean ControlXSmartphone;
    private boolean Ethernet;
    private boolean SalidadaAuriculares;
    private boolean ConexionPc;
    private int numSalidasHDMI;
    private double precio;
    
    public SmartTV (int pulgadasPantalla,String resolucion,int frecuencia,String tecnologiaImagen){
           super (pulgadasPantalla,resolucion,frecuencia,tecnologiaImagen);
    }

  //  public SmartTV(String ID, boolean Certificado, String SistemaOperativo, boolean Wifi, boolean ControlXSmartphone, boolean Ethernet, boolean SalidadaAuriculares, boolean ConexionPc, int numSalidasHDMI, double precio)
    {
        this.ID = ID;
        this.Certificado = Certificado;
        this.SistemaOperativo = SistemaOperativo;
        this.Wifi = Wifi;
        this.ControlXSmartphone = ControlXSmartphone;
        this.Ethernet = Ethernet;
        this.SalidadaAuriculares = SalidadaAuriculares;
        this.ConexionPc = ConexionPc;
        this.numSalidasHDMI = numSalidasHDMI;
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean getCertificado() {
        return Certificado;
    }

    public void setCertificado(boolean Certificado) {
        this.Certificado = Certificado;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String SistemaOperativo) {
        this.SistemaOperativo = SistemaOperativo;
    }

    public boolean getWifi() {
        return Wifi;
    }

    public void setWifi(boolean Wifi) {
        this.Wifi = Wifi;
    }

    public boolean getControlXSmartphone() {
        return ControlXSmartphone;
    }

    public void setControlXSmartphone(boolean ControlXSmartphone) {
        this.ControlXSmartphone = ControlXSmartphone;
    }

    public boolean getEthernet() {
        return Ethernet;
    }

    public void setEthernet(boolean Ethernet) {
        this.Ethernet = Ethernet;
    }

    public boolean getSalidadaAuriculares() {
        return SalidadaAuriculares;
    }

    public void setSalidadaAuriculares(boolean SalidadaAuriculares) {
        this.SalidadaAuriculares = SalidadaAuriculares;
    }

    public boolean getConexionPc() {
        return ConexionPc;
    }

    public void setConexionPc(boolean ConexionPc) {
        this.ConexionPc = ConexionPc;
    }

    public int getNumSalidasHDMI() {
        return numSalidasHDMI;
    }

    public void setNumSalidasHDMI(int numSalidasHDMI) {
        this.numSalidasHDMI = numSalidasHDMI;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     public void MostrarDatos ()
    {
        System.out.println ("Proyector ID: "+ID+
                 "\nPulgadas Pantalla: "+getPulgadasPantalla()+
                 "\nResolucion pantalla: "+getResolucion()+
                 "\nFrecuencia: "+getFrecuencia()+
                 "\nTecnologiaImagen: "+getTecnologiaImagen()+
                 "\nMensajeria (tlf.domestico): "+Certificado+
                 "\nDesvios: "+SistemaOperativo+
                 "\nDesvios: "+Wifi+
                 "\nDesvios: "+ControlXSmartphone+
                 "\nPrecio de Smartphone: "+Ethernet+
                 "\nDesvios: "+SalidadaAuriculares+
                 "\nDesvios: "+ConexionPc+
                 "\nDesvios: "+numSalidasHDMI+
                 "\nPrecio de Smartphone: "+precio);
    }
    
}

        