/**
 * Abstract class Sonido - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
  public class Sonido extends Electrodomestico {
    private float frecuencia;
    private int impedancia;
    private int sensibilidad;
    private boolean antiruido;
    private boolean ecualizador;
    private boolean bluetooth;
    private boolean microfono;
    private String conexion;
    private boolean ajustesvolum;
    private boolean gestionllamadas;
    private boolean pausareproduccion;
    private boolean compatiblepc;
    private boolean compatiblesmartphone;
    private boolean plegables;
    
     public Sonido(String marca, String modelo, double precioUnit, String color, char consumo, double peso){
        super (marca,modelo,precioUnit,color,consumo,peso);
        
        
}

    public Sonido(float frecuencia, int impedancia, int sensibilidad, boolean antiruido, boolean ecualizador, boolean bluetooth, boolean microfono, String conexion, boolean ajustesvolum, boolean gestionllamadas, boolean pausareproduccion, boolean compatiblepc, boolean compatiblesmartphone, boolean plegables) {
        this.frecuencia = frecuencia;
        this.impedancia = impedancia;
        this.sensibilidad = sensibilidad;
        this.antiruido = antiruido;
        this.ecualizador = ecualizador;
        this.bluetooth = bluetooth;
        this.microfono = microfono;
        this.conexion = conexion;
        this.ajustesvolum = ajustesvolum;
        this.gestionllamadas = gestionllamadas;
        this.pausareproduccion = pausareproduccion;
        this.compatiblepc = compatiblepc;
        this.compatiblesmartphone = compatiblesmartphone;
        this.plegables = plegables;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getImpedancia() {
        return impedancia;
    }

    public void setImpedancia(int impedancia) {
        this.impedancia = impedancia;
    }

    public int getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(int sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public boolean getAntiruido() {
        return antiruido;
    }

    public void setAntiruido(boolean antiruido) {
        this.antiruido = antiruido;
    }

    public boolean getEcualizador() {
        return ecualizador;
    }

    public void setEcualizador(boolean ecualizador) {
        this.ecualizador = ecualizador;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean getMicrofono() {
        return microfono;
    }

    public void setMicrofono(boolean microfono) {
        this.microfono = microfono;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public boolean getAjustesvolum() {
        return ajustesvolum;
    }

    public void setAjustesvolum(boolean ajustesvolum) {
        this.ajustesvolum = ajustesvolum;
    }

    public boolean getGestionllamadas() {
        return gestionllamadas;
    }

    public void setGestionllamadas(boolean gestionllamadas) {
        this.gestionllamadas = gestionllamadas;
    }

    public boolean getPausareproduccion() {
        return pausareproduccion;
    }

    public void setPausareproduccion(boolean pausareproduccion) {
        this.pausareproduccion = pausareproduccion;
    }

    public boolean getCompatiblepc() {
        return compatiblepc;
    }

    public void setCompatiblepc(boolean compatiblepc) {
        this.compatiblepc = compatiblepc;
    }

    public boolean getCompatiblesmartphone() {
        return compatiblesmartphone;
    }

    public void setCompatiblesmartphone(boolean compatiblesmartphone) {
        this.compatiblesmartphone = compatiblesmartphone;
    }

    public boolean getPlegables() {
        return plegables;
    }

    public void setPlegables(boolean plegables) {
        this.plegables = plegables;
    }
}