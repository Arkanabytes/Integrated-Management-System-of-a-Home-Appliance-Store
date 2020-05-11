/**
 * Write a description of class Empleados here.
 * 
 * @author (Consuelo Alejandra Pinto Toro) 
 * @version (a version number or a date)
 */

    public class Empleado extends Persona {
    private static double pagoPorHoraExtra; //atributo de clase 
    //private inicializacion_contrato; 
    private double sueldoBase;// sueldo base 
    private int horasExtras;//horas extras del empleado
    private double tipoIRPF;// Tipo de retencion calculamos el IRPF
    private char casado;  //si es casado si o no
    private int numeroHijos; // funcion del Irf
//Constructor
    public Empleado(double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos, String nombre, String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        super(nombre, apellidos, dni, sexo, edad, direccion, telefono);
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipoIRPF = tipoIRPF;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }
//Constructor de la clase que hereda a personas y sus atributos
    public Empleado(String nombre, String apellidos, String dni, char sexo, int edad, String direccion, int telefono) {
        super(nombre, apellidos, dni, sexo, edad, direccion, telefono);
        
        
    }
// setters y getters
    public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public void setCasado(char casado) {
        this.casado = casado;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public static double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public char getCasado() {
        return casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }  
     //calcular el importe de las horas extra
    public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }
   
    //calcular el sueldo bruto
    public double calcularSueldoBruto(){
        return sueldoBase + calcularImporteHorasExtras();
    }
   
    //calcular el importe de las retencion por IRPF
    public double calcularRetencionIrpf(){
        double tipo = tipoIRPF;
        if(casado == 's' || casado == 'S') {
            tipo = tipo - 2; //2 puntos menos si está casado
        }
        tipo = tipo - numeroHijos; //un punto menos por cada hijo
        if(tipo<0){
            tipo = 0;
        }
        return calcularSueldoBruto() * tipo / 1000;
    }
   
    //calcular el importe liquido a cobrar
    public double calcularSueldo(){
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }

    //mostrar los datos de un trabajador
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDni: ");
        sb.append("\nSueldo Base: ");
        sb.append(sueldoBase);
        sb.append("\nHoras Extras: ");
        sb.append(horasExtras);
        sb.append("\ntipo IRPF: ");
        sb.append(tipoIRPF);
        sb.append("\nCasado: ");
        sb.append(casado);
        sb.append("\nNumero de Hijos: ");
        sb.append(numeroHijos);
        return  sb.toString();
    }
  }

   /*     
    private static double pagoPorHoraExtra; //atributo de clase
    
    //private inicializacion_contrato; 
    private double sueldoBase;
    private int horasExtras;
    private double tipoIRPF;
    private char casado;  
    private int numeroHijos;
  
    //Constructor por defecto
    public Empleado() {
    }

    //Constructor con un parámetro
 

    //Métodos get/set
    public char getCasado() {
        return casado;
    }

    public void setCasado(char casado) {
        this.casado = casado;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    //métodos get/set para el atributo static
    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
    }
   
   
    //calcular el importe de las horas extra
    public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }
   
    //calcular el sueldo bruto
    public double calcularSueldoBruto(){
        return sueldoBase + calcularImporteHorasExtras();
    }
   
    //calcular el importe de las retencion por IRPF
    public double calcularRetencionIrpf(){
        double tipo = tipoIRPF;
        if(casado == 's' || casado == 'S') {
            tipo = tipo - 2; //2 puntos menos si está casado
        }
        tipo = tipo - numeroHijos; //un punto menos por cada hijo
        if(tipo<0){
            tipo = 0;
        }
        return calcularSueldoBruto() * tipo / 100;
    }
   
    //calcular el importe liquido a cobrar
    public double calcularSueldo(){
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }

    //mostrar los datos de un trabajador
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDni: ");
        sb.append("\nSueldo Base: ");
        sb.append(sueldoBase);
        sb.append("\nHoras Extras: ");
        sb.append(horasExtras);
        sb.append("\ntipo IRPF: ");
        sb.append(tipoIRPF);
        sb.append("\nCasado: ");
        sb.append(casado);
        sb.append("\nNumero de Hijos: ");
        sb.append(numeroHijos);
        return  sb.toString();
    }
    }
 */
