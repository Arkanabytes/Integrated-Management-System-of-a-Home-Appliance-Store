import java.util.Date;
/**
 * Write a description of class Tecnico here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (1 de junio de 2018)
 */
public class Tecnico extends Empleado {

        private boolean garantia=true;
	private int garantiaPlus =1;
	private Date start;
        private Date finish;
        private int number;
	private boolean reparacion;
	private Producto productos[] = null;
	private String SolicitaReparacion;
	private double caja;
 
public Tecnico (double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos, String nombre, String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        super(nombre, apellidos, dni, sexo, edad, direccion, telefono);
    }

    public Tecnico(boolean garantia,int grantiaPlus,Date start,Date finish,int number,boolean reparacion,Producto producto [],
                   String SolicitaReparacion,double caja,double sueldoBase, int horasExtras, double tipoIRPF,char casado,int numeroHijos,
                   String nombre, String apellidos,String dni, char sexo, int edad, String direccion, int telefono){
        super(nombre, apellidos, dni, sexo, edad, direccion, telefono);

        this.garantia= garantia;
        this.garantiaPlus= garantiaPlus;
        this.start = start;
        this.finish = finish;
        this.number = number;
        this.reparacion = reparacion;
        this.productos= productos;
        this.SolicitaReparacion = SolicitaReparacion;
        this.caja =caja;
        
    }

    public boolean getGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public int getGarantiaPlus() {
        return garantiaPlus;
    }

    public void setGarantiaPlus(int garantiaPlus) {
        this.garantiaPlus = garantiaPlus;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getReparacion() {
        return reparacion;
    }

    public void setReparacion(boolean reparacion) {
        this.reparacion = reparacion;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public String getSolicitaResparacion() {
        return SolicitaReparacion;
    }

    public void setSolicitaResparacion(String SolicitaResparacion) {
        this.SolicitaReparacion = SolicitaReparacion;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

      public void MostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellidos()+
                "\nDni: "+getDni()+
                "\nSexo: "+getSexo()+
                "\nEdad: "+getEdad()+
                "\nDireccion: "+getDireccion()+
                "\nTelefono: "+getTelefono()+
                "\nGarantia de tres meses: "+getGarantia()+
                "\nGarantia Plus: "+garantiaPlus+
                "\nSolicita Financiacion: "+start+
                "\nConcedida Financiacion: "+finish+
                "\nGarantia Plus: "+garantiaPlus+
                "\nSolicita Financiacion: "+number+
                "\nConcedida Financiacion: "+reparacion+
                  "\nGarantia Plus: "+productos+
                "\nSolicita Financiacion: "+SolicitaReparacion+
                "\nConcedida Financiacion: "+caja);
    
    
    
    }
     
}    
        
  
	    
	    
	    
	    
