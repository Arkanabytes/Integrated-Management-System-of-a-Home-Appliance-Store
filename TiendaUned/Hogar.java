/**
 * Abstract class Informatica - write a description of the class here
 * @author:Consuelo Alejandra Pinto Toro
 * Date: 
 */
public class Hogar extends Electrodomestico {
        private String Cocina;
        private String Frigorificos;
        private String CafeTe;
        private String Lavadora;
        private String Calefaccion;
        private String Limpieza;
       //en la clase electrodomestico ya esta inicializado el constructor
    public Hogar (String marca, String modelo, double precioUnit, String color, char consumo, double peso){
        super (marca,modelo,precioUnit,color,consumo,peso);
    //AHORA INICIALIZO EL CONSTRUCTOR DE ESTA CLASE    
    
}

    public Hogar(String Cocina, String Frigorificos, String CafeTe, String Lavadora, String Calefaccion, String Limpieza) {
        this.Cocina = Cocina;
        this.Frigorificos = Frigorificos;
        this.CafeTe = CafeTe;
        this.Lavadora = Lavadora;
        this.Calefaccion = Calefaccion;
        this.Limpieza = Limpieza;
    }

    public String getCocina() {
        return Cocina;
    }

    public void setCocina(String Cocina) {
        this.Cocina = Cocina;
    }

    public String getFrigorificos() {
        return Frigorificos;
    }

    public void setFrigorificos(String Frigorificos) {
        this.Frigorificos = Frigorificos;
    }

    public String getCafeTe() {
        return CafeTe;
    }

    public void setCafeTe(String CafeTe) {
        this.CafeTe = CafeTe;
    }

    public String getLavadora() {
        return Lavadora;
    }

    public void setLavadora(String Lavadora) {
        this.Lavadora = Lavadora;
    }

    public String getCalefaccion() {
        return Calefaccion;
    }

    public void setCalefaccion(String Calefaccion) {
        this.Calefaccion = Calefaccion;
    }

    public String getLimpieza() {
        return Limpieza;
    }

    public void setLimpieza(String Limpieza) {
        this.Limpieza = Limpieza;
    }
    
}

