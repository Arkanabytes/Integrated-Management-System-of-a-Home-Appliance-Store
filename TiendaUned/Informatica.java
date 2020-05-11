/**
 * Abstract class Informatica - write a description of the class here
 * @author:Consuelo Alejandra Pinto Toro
 * Date: 
 */
public class Informatica extends Electrodomestico {
    private String capacidad;
    private String memoriaRam;
    private int procesador;
    private String bateria;
    private String conectividad;
    private String sistemaOperativo;
    private String tecnologiaImagen;
    private int camaraDelantera;
    private boolean camaraTrasera;
    private boolean conexiones =false;
    //en la clase electrodomestico ya esta inicializado el constructor
    public Informatica (String marca, String modelo, double precioUnit, String color, char consumo, double peso){
        super (marca,modelo,precioUnit,color,consumo,peso);
    //AHORA INICIALIZO EL CONSTRUCTOR DE ESTA CLASE   
    }
    public Informatica(String capacidad, String memoriaRam, int procesador, String bateria, String conectividad, String sistemaOperativo, String tecnologiaImagen, int camaraDelantera, boolean camaraTrasera) {
        this.capacidad = capacidad;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.bateria = bateria;
        this.conectividad = conectividad;
        this.sistemaOperativo = sistemaOperativo;
        this.tecnologiaImagen = tecnologiaImagen;
        this.camaraDelantera = camaraDelantera;
        this.camaraTrasera = camaraTrasera;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getProcesador() {
        return procesador;
    }

    public void setProcesador(int procesador) {
        this.procesador = procesador;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTecnologiaImagen() {
        return tecnologiaImagen;
    }

    public void setTecnologiaImagen(String tecnologiaImagen) {
        this.tecnologiaImagen = tecnologiaImagen;
    }

    public int getCamaraDelantera() {
        return camaraDelantera;
    }

    public void setCamaraDelantera(int camaraDelantera) {
        this.camaraDelantera = camaraDelantera;
    }

    public boolean isCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(boolean camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public boolean isConexiones() {
        return conexiones;
    }

    public void setConexiones(boolean conexiones) {
        this.conexiones = conexiones;
    }
    
}

/*
public class Informatica extends Electrodomestico {
    private String capacidad;
    private String memoriaRam;
    private int procesador;
    private String bateria;
    private String conectividad;
    private String sistemaOperativo;
    private String tecnologiaImagen;
    private int camaraDelantera;
    private boolean camaraTrasera;
    private boolean conexiones =false;

    public Informatica( String marca,String modelo,double precioUnit,String color,char consumo,double peso,
            String capacidad, String memoriaRam, int procesador, String bateria, String conectividad, 
            String sistemaOperativo, String tecnologiaImagen, int camaraDelantera, boolean camaraTrasera){
        this.capacidad = capacidad;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.bateria = bateria;
        this.conectividad = conectividad;
        this.sistemaOperativo = sistemaOperativo;
        this.tecnologiaImagen = tecnologiaImagen;
        this.camaraDelantera = camaraDelantera;
        this.camaraTrasera = camaraTrasera;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public int getProcesador() {
        return procesador;
    }

    public String getBateria() {
        return bateria;
    }

    public String getConectividad() {
        return conectividad;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getTecnologiaImagen() {
        return tecnologiaImagen;
    }

    public int getCamaraDelantera() {
        return camaraDelantera;
    }

    public boolean isCamaraTrasera() {
        return camaraTrasera;
    }

    public boolean isConexiones() {
        return conexiones;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setProcesador(int procesador) {
        this.procesador = procesador;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTecnologiaImagen(String tecnologiaImagen) {
        this.tecnologiaImagen = tecnologiaImagen;
    }

    public void setCamaraDelantera(int camaraDelantera) {
        this.camaraDelantera = camaraDelantera;
    }

    public void setCamaraTrasera(boolean camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public void setConexiones(boolean conexiones) {
        this.conexiones = conexiones;
    }
     
    
}
*/
