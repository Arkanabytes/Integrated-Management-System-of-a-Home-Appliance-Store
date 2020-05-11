import java.util.ArrayList;
/**
 * Write a description of class Clientes here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (a version number or a date)
 */
public class Clientes extends Persona
{   
    private String ID;
    private int ultima_nomina;
    private boolean solicita_financiacion;
    private boolean concedida_financiacion;

    public Clientes(String nombre, String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        super(nombre, apellidos, dni, sexo, edad, direccion, telefono);
    }

    public Clientes(String ID, int ultima_nomina, boolean solicita_financiacion, boolean concedida_financiacion, String nombre,
                    String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        super(nombre, apellidos, dni, sexo, edad, direccion, telefono);
        this.ID = ID;
        this.ultima_nomina = ultima_nomina;
        this.solicita_financiacion = solicita_financiacion;
        this.concedida_financiacion = concedida_financiacion;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setUltima_nomina(int ultima_nomina) {
        this.ultima_nomina = ultima_nomina;
    }

    public void setSolicita_financiacion(boolean solicita_financiacion) {
        this.solicita_financiacion = solicita_financiacion;
    }

    public void setConcedida_financiacion(boolean concedida_financiacion) {
        this.concedida_financiacion = concedida_financiacion;
    }

    public String getID() {
        return ID;
    }

    public int getUltima_nomina() {
        return ultima_nomina;
    }

    public boolean isSolicita_financiacion() {
        return solicita_financiacion;
    }

    public boolean isConcedida_financiacion() {
        return concedida_financiacion;
    }
    public void MostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellidos()+
                "\nDni: "+getDni()+
                "\nSexo: "+getSexo()+
                "\nEdad: "+getEdad()+
                "\nDireccion: "+getDireccion()+
                "\nTelefono: "+getTelefono()+
                "\nID: "+getID()+
                "\nUltima nomina: "+solicita_financiacion+
                "\nSolicita Financiacion: "+solicita_financiacion+
                "\nConcedida Financiacion: "+concedida_financiacion);
    
    }
}



