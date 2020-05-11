import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reparaciones extends Tecnico{
    private Producto productoRep;
    private Date start;
    private Date finish;
    private int number;

    public Reparaciones (double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos, String nombre, String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        super(nombre, apellidos, dni, sexo, edad, direccion, telefono);
    }

    public Reparaciones (boolean garantia,int grantiaPlus,Date start,Date finish,int number,boolean reparacion,Producto productoRep [],
                   String SolicitaReparacion,double caja,double sueldoBase, int horasExtras, double tipoIRPF,char casado,int numeroHijos,
                   String nombre, String apellidos,String dni, char sexo, int edad, String direccion, int telefono);
     //              super(nombre, apellidos, dni, sexo, edad, direccion, telefono,Producto productoRep,number);

    public Reparaciones(Producto productoRep, Date start, Date finish, int number) {
        super(sueldoBase,horasExtras,tipoIRPF,casado,numeroHijos,nombre);
        this.productoRep = productoRep;
        this.start = start;
        this.finish = finish;
        this.number = number;
        this.Producto = ProductoRep;
       
    }
                   
        public Reparaciones(Producto producto,int number){
        this.producto = productoRep;
        this.start = new productoRep();
        this.finish = new productoRep ();
        this.number = number;
    }

    @Override
    public String toString() {
        String format = "dd/MM/yy";
        SimpleDateFormat formater = new SimpleDateFormat(format);
        StringBuilder str = new StringBuilder();

        str.append(number);
        str.append(" ");
        str.append(productoRep.getName());
        if (productoRep instanceof Tablet || productoRep instanceof Torre
                || productoRep instanceof SmartTV) {
            str.append('(');
            str.append(((WithOS) productoRep).getOs());
            str.append(')');
        }
        str.append(" en reparation du ");
        str.append(formater.format(start));
        str.append(" au ");
        str.append(formater.format(finish));

        return str.toString();
    }
    //getters y setters
    public ProductoRep getProductoRep() {
        return ProductoRep;
    }

    public void setProductoRep(Producto productoRep) {
        this.productoRep = productoRep;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

}

