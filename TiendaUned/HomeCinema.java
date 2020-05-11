
/**
 * Write a description of class Reproductor here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (a version number or a date)
 */
   public class HomeCinema extends Sonido {
     private String ID;
     private boolean lectorBlueray;
     private boolean smartTV;
     private boolean radio;
     private boolean cuatrok;
     private int Usb;
     private double precio;

       public HomeCinema (float frecuencia, int impedancia, int sensibilidad, boolean antiruido,
               boolean ecualizador, boolean bluetooth, boolean microfono, String conexion, boolean ajustesvolum,
               boolean gestionllamadas, boolean pausareproduccion, 
               boolean compatiblepc, boolean compatiblesmartphone, boolean plegables) {
         super(frecuencia, impedancia,sensibilidad,antiruido, ecualizador,
               bluetooth,microfono,conexion,ajustesvolum,gestionllamadas,pausareproduccion, 
               compatiblepc,compatiblesmartphone, plegables);
       } 

   // public HomeCinema(String ID, boolean lectorBlueray, boolean smartTV, boolean radio, boolean cuatrok, int Usb, double precio) 
    {
        this.ID = ID;
        this.lectorBlueray = lectorBlueray;
        this.smartTV = smartTV;
        this.radio = radio;
        this.cuatrok = cuatrok;
        this.Usb = Usb;
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isLectorBlueray() {
        return lectorBlueray;
    }

    public void setLectorBlueray(boolean lectorBlueray) {
        this.lectorBlueray = lectorBlueray;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isCuatrok() {
        return cuatrok;
    }

    public void setCuatrok(boolean cuatrok) {
        this.cuatrok = cuatrok;
    }

    public int getUsb() {
        return Usb;
    }

    public void setUsb(int Usb) {
        this.Usb = Usb;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void MostrarDatos()
{

        System.out.println("Auriculares ID: "+ID+
                "\nFrecuencia: "+getFrecuencia()+
                "\nImpedancia: "+getImpedancia()+
                "\nDispone de bateria: "+getSensibilidad()+
                "\nElimininacion del ruido: "+getAntiruido()+
                "\nEcualizador: "+getEcualizador()+
                "\nSistema bluetooth disponible: "+getBluetooth()+
                "\nMicrofono incorporado "+getMicrofono()+
                "\nSalidas de conexion: "+getConexion()+
                "\nAjustes volumen: "+getAjustesvolum()+
                "\nAdmite llamadas: "+getGestionllamadas()+
                "\nPausa reproducciones: "+getPausareproduccion()+
                "\nCompatible pc: "+getCompatiblepc()+
                "\nCompatible smartphone: "+getCompatiblesmartphone()+
                "\nPlegables: "+getPlegables()+
                "\nReproduce BLUERAY: "+lectorBlueray+
                "\nReproduce 4k: "+smartTV+
                "\nConexiones Usb: "+Usb+
                "\nRadio: "+radio+
                "\nReproduce 4k: "+cuatrok+
                "\nConexiones Usb: "+Usb+
                "\nPrecio: "+precio);
            }
        }
