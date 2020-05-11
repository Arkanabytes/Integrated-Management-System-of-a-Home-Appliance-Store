/**
 * Abstract class Imagen - write a description of the class here
 * 
 * @author: Consuel Alejandra Pinto Toro
 * Date: 
 */
   public class Imagen extends Electrodomestico {
    private int pulgadasPantalla;
    private String resolucion;
    private int frecuencia;
    private String tecnologiaImagen;
    //en la clase electrodomestico ya esta inicializado el constructor
    public Imagen (String marca, String modelo, double precioUnit, String color, char consumo, double peso){
        super (marca,modelo,precioUnit,color,consumo,peso);
    //AHORA INICIALIZO EL CONSTRUCTOR DE ESTA CLASE    
    }
    public Imagen(int pulgadasPantalla, String resolucion, int frecuencia, String tecnologiaImagen) {
        this.pulgadasPantalla = pulgadasPantalla;
        this.resolucion = resolucion;
        this.frecuencia = frecuencia;
        this.tecnologiaImagen = tecnologiaImagen;
    }

    public int getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(int pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTecnologiaImagen() {
        return tecnologiaImagen;
    }

    public void setTecnologiaImagen(String tecnologiaImagen) {
        this.tecnologiaImagen = tecnologiaImagen;
    }
    
    
}
