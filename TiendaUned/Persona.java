/**
 * Abstract class Persona - write a description of the class here
 * 
 * @author:Consuelo Alejandra Pinto Toro
 * Date: 
 */
public abstract class Persona 
{
    //VARIABLES
    
        private String nombre; //Dato nombre de persona
        private String apellidos; //Dato apellidos de persona
        private String dni;
        private char sexo;
        private int edad;//Dato edad de persona
        private String direccion;//Dato de direccion de persona ya sea para clientes y empleados
        private int telefono;//Dato de telefono
    //Constructores
    public Persona(String nombre, String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    //getters & setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
     public void mayorEdad(int edad){
                if(edad>18)
                        System.out.println("Es mayor de edad");
                else
                        System.out.println("Es menor de edad no es posible su regsitro");
        }
        
}
    
        


