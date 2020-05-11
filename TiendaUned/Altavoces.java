
/**
 * Write a description of class Altavoces here.
 * 
 * @author (Consuelo Aleajandra Pinto Toro) 
 * @version (1-06-2018)
 */
public class Altavoces extends Sonido
{
    // instance variables - replace the example below with your own
    private String ID;
    private int potencia;
    private double precio;

       public Altavoces (float frecuencia, int impedancia, int sensibilidad, boolean antiruido,
               boolean ecualizador, boolean bluetooth, boolean microfono, String conexion, boolean ajustesvolum,
               boolean gestionllamadas, boolean pausareproduccion, 
               boolean compatiblepc, boolean compatiblesmartphone, boolean plegables) {
         super(frecuencia, impedancia,sensibilidad,antiruido, ecualizador,
               bluetooth,microfono,conexion,ajustesvolum,gestionllamadas,pausareproduccion, 
               compatiblepc,compatiblesmartphone, plegables);
       } 
       
 //public Auriculares(String ID, int potencia, double precio) 
   {
        this.ID = ID;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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
                "\nPotencia en decibelios: "+potencia+
                "\nPrecio: "+precio);
                }
}
