/**
 * Write a description of class Cocina here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (a version number or a date)
 */
public class Cocina extends Hogar
{
    // instance variables - replace the example below with your own
     String ID;
     int zonasCoccion;
     String Tipo;//tipo material
     boolean bloqueoMandos;
     boolean sistSeguridad=true;
     boolean tempo=true;
     double precio;
     public Cocina (String Cocina, String Frigorificos, String CafeTe, String Lavadora, String Calefaccion, String Limpieza)
	{
		super (Cocina,Frigorificos,CafeTe,Lavadora,Calefaccion,Limpieza);
    }
    void setId (String id)
    {
        ID = id;
    }
    void setZonasCoccion (int zonasCoccion)
    {
        zonasCoccion=zonasCoccion;
    }
    void setTipo (String Tipo)
    {
         Tipo= Tipo;
    }
    void setSistSeguridad (boolean SistSeguridad)
    {
        SistSeguridad = SistSeguridad;
    }
    void setTempo (boolean Tempo)
    {
        tempo = Tempo;
    }
    void setPrecio (double Precio)
    {
        precio = Precio;
    }
    
   //getters
    String getID()
    {
      return ID;
    }
    int getZonasCoccion()
    {
        return zonasCoccion;
    }
    String getTipo()
    {
        return Tipo;
    }
    boolean getBloqueoMandos()
    {
        return bloqueoMandos;
    }
    boolean getTempo()
    {
        return tempo;
    }
    double getPrecio ()
    {
        return precio;   
    }
    void displaySmartphone ()
    {
        System.out.println ("Smartphone Id: "+ getID());
        System.out.println ("Procesador: "+ getZonasCoccion ());
        System.out.println ("RAM: "+ getTipo());
        System.out.println ("Almacenamiento: "+getBloqueoMandos());
        System.out.println ("Camara: "+getTempo());
        System.out.println ("Precio Smartphone:" +getPrecio());
     }

}
