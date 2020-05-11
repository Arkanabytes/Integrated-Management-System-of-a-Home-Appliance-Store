
/**
 * Abstract class Telefonia - write a description of the class here
 * 
 * @author: Consuelo Alejandra Pinto Toro
 * Date: 
 */

public class Telefonia extends Electrodomestico  {
    
    private boolean analogico;
    private boolean digital;
    private boolean ip;
    private boolean controlLlamadas;
    private boolean servicioEmergencia;
    private boolean mensajeria;
    private boolean desvios;
    private boolean llamadasVd;
    //en la clase electrodomestico ya esta inicializado el constructor
    public Telefonia (String marca, String modelo, double precioUnit, String color, char consumo, double peso){
        super (marca,modelo,precioUnit,color,consumo,peso);
    }
    //AHORA INICIALIZO EL CONSTRUCTOR DE ESTA CLASE 
    public Telefonia(boolean analogico,boolean digital,boolean ip,boolean controlLlamadas,
            boolean servicioEmergencia,boolean mensajeria,boolean desvios,boolean llamadasVd){
          this.analogico= analogico;
          this.digital=digital;
          this.ip=ip;
          this.controlLlamadas= controlLlamadas;
          this.servicioEmergencia= servicioEmergencia;
          this.mensajeria= mensajeria;
          this.desvios= desvios;
          this.llamadasVd=llamadasVd;
}

    public boolean getAnalogico() {
        return analogico;
    }

    public void setAnalogico(boolean analogico) {
        this.analogico = analogico;
    }

    public boolean getDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public boolean getIp() {
        return ip;
    }

    public void setIp(boolean ip) {
        this.ip = ip;
    }

    public boolean getControlLlamadas() {
        return controlLlamadas;
    }

    public void setControlLlamadas(boolean controlLlamadas) {
        this.controlLlamadas = controlLlamadas;
    }

    public boolean getServicioEmergencia() {
        return servicioEmergencia;
    }

    public void setServicioEmergencia(boolean servicioEmergencia) {
        this.servicioEmergencia = servicioEmergencia;
    }

    public boolean getMensajeria() {
        return mensajeria;
    }

    public void setMensajeria(boolean mensajeria) {
        this.mensajeria = mensajeria;
    }

    public boolean getDesvios() {
        return desvios;
    }

    public void setDesvios(boolean desvios) {
        this.desvios = desvios;
    }

    public boolean getLlamadasVd() {
        return llamadasVd;
    }

    public void setLlamadasVd(boolean llamadasVd) {
        this.llamadasVd = llamadasVd;
    }
    
}
/*
public class Telefonia extends Electrodomestico
{
    // instance variables - replace the example below with your own
    private boolean analogico= false;
    private boolean digital=false;
    private boolean ip=false;
    private boolean controlLlamadas=false;
    private boolean servicioEmergencia=false;
    private boolean mensajeria=false;
    private boolean desvios=false;
    private boolean llamadasVd=false;
    
    public Telefonia (String marca,String modelo,double precioUnit,String color,char consumo,double peso,int disponible,int garantia,
	           String cantStock){
	           super (marca, modelo,precioUnit,color,consumo,peso,disponible,garantia,cantStock);
                    this.analogico= false;
                    this.digital=false;
                    this.ip=false;
                    this.controlLlamadas=false;
                    this.servicioEmergencia=false;
                    this.mensajeria=false;
                    this.desvios=false;
                    this.llamadasVd=false;
}
    public Telefonia (){
    }
    public boolean getAnalogico(){
        return analogico;
    }
    public void setAnalogico(boolean analogico){
        this.analogico=analogico;
    }
    public boolean getDigital(){
        return digital;
    }
    public void setDigital(boolean digital){
        this.digital= digital;
    }
    public boolean getIp(){
        return ip;
    }
    public void setIp(){
        this.ip=ip;
    }
    public boolean getControlLlamadas(){
        return controlLlamadas;
    }
    public void setControlLlamadas(boolean controlLlamadas){
        this.controlLlamadas=controlLlamadas;
    }
    
    public boolean getServicioEmergencia(){
        return servicioEmergencia;
    }
    public void setServicioEmergencia(boolean servicioEmergencia){
        this.servicioEmergencia= servicioEmergencia;
    }
    public boolean getMensajeria(){
        return mensajeria;
    }
    public void setMensajeria(boolean mensajeria){
        this.mensajeria=mensajeria;
    }
    
    public boolean getDesvios(){
        return desvios;
    }
    public void setDesvios(boolean desvios){
        this.desvios=desvios;
    }
   // public boolean setLlamadasVd(){
     //   this.llamadasVd=llamadasVd;
    //}
    public boolean getLlamadasVd(){
        return llamadasVd;
    }
   
} */
