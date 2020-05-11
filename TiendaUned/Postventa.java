
/**
 * Write a description of class Postventa here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (a version number or a date)
 */

import java.util.Date;
import java.text.SimpleDateFormat;


public class Postventa extends Empleado {
    private Producto producto;//Producto que tendremos guardado
    private String devolucion;//Devolucion del producto
    private Date start;//fecha de entrada al sistema
    private String cambioproducto; // cambio de producto
    private int number;//numero de identificador de devolucion
    private String ID;// identificador de producto
    
    public Postventa(double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos, String nombre,
                       String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        super(sueldoBase,horasExtras,tipoIRPF,casado,numeroHijos,nombre,apellidos,dni,sexo,edad,direccion,telefono);
    }
  
    public Postventa (Producto producto, String devolucion, Date start, String cambioproducto, int number, String ID)
     super(devolucion,start,cambioproducto,number,ID ,sueldoBase,horasExtras,tipoIRPF,casado,numeroHijos,
                   nombre,apellidos,dni,sexo,edad,direccion,telefono);

    {
        this.producto = producto;
        this.start = new devolucion();
        this.devolucion = devolucion;
        this.start = start;
        this.cambioproducto = cambioproducto;
        this.number = number;
        this.ID = ID;
    }
    
       @Override
    public String toString() {
        String format = "dd/MM/yy";
        SimpleDateFormat formater = new SimpleDateFormat(format);
        StringBuilder str = new StringBuilder();

        str.append(number);
        str.append(" ");
        StringBuilder number = str.append(producto.getNumber());
        if (producto instanceof Tablet || producto instanceof Portatil
                || producto instanceof Altavoces || producto instanceof Auriculares || producto instanceof Reproductor
                || producto instanceof HomeCinema ||producto instanceof Torre ||producto instanceof Lavajillas
                || producto instanceof Smartphone ||producto instanceof Fijo || producto instanceof Proyector || producto instanceof SmartTV
                || producto instanceof HomeCinema ||producto instanceof Torre || producto instanceof Lavadora
                || producto instanceof Smartphone || producto instanceof Cocina){
            str.append('(');
            str.append(((WithOS) producto).getOs());
            str.append(')');
        }
        str.append(" en devolucion ");
        str.append(formater.format(start));
        str.append(" au ");
        str.append(formater.format());

        return str.toString();
    }
    public String getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }

    public String getCambioproducto() {
        return cambioproducto;
    }

    public void setCambioproducto(String cambioproducto) {
        this.cambioproducto = cambioproducto;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    private static class devolucion extends Date {

        public devolucion() {
        }
    }
}