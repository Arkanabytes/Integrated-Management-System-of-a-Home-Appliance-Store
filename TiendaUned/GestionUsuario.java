
/**
 * Write a description of class GestionUsuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public class GestionUsuario extends Empleado {
    private String correo;
    private int fichaCliente;
    private int ficha_cliente;
 
   //Constructor
    public GestionUsuario(double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos, String nombre, String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        super(nombre, apellidos, dni, sexo, edad, direccion, telefono);

    }
   // public GestionUsuario(String correo, int fichacliente,String nombre,String apellidos, String dni, char sexo, int edad, String direccion, int telefono);
     //    super (nombre, apellidos, dni, sexo, edad, direccion, telefono);
    {
        this.correo = correo;
        this.ficha_cliente= fichaCliente;
    }
    public void setcorreo(String correo){        
        this.correo=correo.toUpperCase();
    }
    public void setficha_cliente(int ficha_cliente){
        this.ficha_cliente=ficha_cliente;
    }
 
    public String getcorreo() {
        return this.correo;
    }
 
    public int getficha_cliente() {
        return ficha_cliente;
    }

    private static class nombre {

        public nombre() {
        }
    }
    }