
/**
 * Write a description of class Reproductor here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (a version number or a date)
 */
public class Reproductor extends Sonido
{
    private String ID;
    private boolean sumergible;
    private int capacidad;
    private int bateria;
    private int peso;
    private double precio;
    
      public Reproductor (float frecuencia, int impedancia, int sensibilidad, boolean antiruido,
               boolean ecualizador, boolean bluetooth, boolean microfono, String conexion, boolean ajustesvolum,
               boolean gestionllamadas, boolean pausareproduccion, 
               boolean compatiblepc, boolean compatiblesmartphone, boolean plegables) {
         super(frecuencia, impedancia,sensibilidad,antiruido, ecualizador,
               bluetooth,microfono,conexion,ajustesvolum,gestionllamadas,pausareproduccion, 
               compatiblepc,compatiblesmartphone, plegables);
       } 

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isSumergible() {
        return sumergible;
    }

    public void setSumergible(boolean sumergible) {
        this.sumergible = sumergible;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
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
                "\nSumergible: "+sumergible+
                "\nCapacidad: "+capacidad+
                "\nPeso: "+peso+
                "\nPrecio: "+precio);
            }
        }
        