import java.lang.*;
import java.util.*;

/**
 * Write a description of class Otorre here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (a version number or a date)
 */

public class Tablet extends Informatica {
      private String ID;
    //SISTEMA OPERATIVO
    private double nucleos;
    //ALMACENAMIENTo
    private double almacenamientoInt;
    //
    private float pulgadas;
    private double precio;
    
     public Tablet (String capacidad, String memoriaRam, int procesador, 
             String bateria, String conectividad, String sistemaOperativo, String tecnologiaImagen, 
             int camaraDelantera, boolean camaraTrasera) {
     super (capacidad, memoriaRam,procesador, bateria,conectividad,sistemaOperativo,tecnologiaImagen,camaraDelantera,camaraTrasera);
     }

  //  public Tablet(String ID, double nucleos, double almacenamientoInt, float pulgadas, double precio);
    {
    
        this.ID = ID;
        this.nucleos = nucleos;
        this.almacenamientoInt = almacenamientoInt;
        this.pulgadas = pulgadas;
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

    public double getAlmacenamientoInt() {
        return almacenamientoInt;
    }

    public void setAlmacenamientoInt(double almacenamientoInt) {
        this.almacenamientoInt = almacenamientoInt;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


      public void MostrarDatos()
{
        System.out.println("Tablet ID: "+ID+
                "\nMemoria Ram: "+getMemoriaRam()+
                "\nProcesador: "+getProcesador()+
                "\nDispone de bateria: "+getBateria()+
                "\nConectividad: "+getConectividad()+
                "\nSistema Operativo: "+getSistemaOperativo()+
                "\nTecnologia de imagen: "+getTecnologiaImagen()+
                "\nDispone Camara delantera: "+getCamaraDelantera()+
          //      "\nDispone Camara trasera: "+getCamaraTrasera()+
                "\nNucleos: "+nucleos+
                "\nAlmacenamiento Interno: "+almacenamientoInt+
                "\nPulgadas: "+pulgadas+
                "\nPrecio Tablet: "+precio);
            }
        }
  