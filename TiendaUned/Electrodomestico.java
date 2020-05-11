import java.lang.*;
import java.util.Scanner;

	/*
	 * @author: Consuelo alejandra Pinto Toro
	 * Date:            */
	
       public abstract class Electrodomestico
	{
	    // instance variables - replace the example below with your own
	        private String marca;//Marca de electrodomesticos 
	        private String modelo;//Modelo de electrodomestico
	        private double precioUnit;//Precio por unidad
	        private String color;//color del electrodomesticos
	        private char consumo;// consumo del electrodomesticos
	        private double peso; // el peso del producto 
            
	        //Constructores de la misma clase para 
            public Electrodomestico(String marca, String modelo, double precioUnit, String color, char consumo, double peso) {
                this.marca = marca;
                this.modelo = modelo;
                this.precioUnit = precioUnit;
                this.color = color;
                this.consumo = consumo;
                this.peso = peso;
            }
            //setters y getters
            public void setMarca(String marca) {
                this.marca = marca;
            }

            public void setModelo(String modelo) {
                this.modelo = modelo;
            }

            public void setPrecioUnit(double precioUnit) {
                this.precioUnit = precioUnit;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public void setConsumo(char consumo) {
                this.consumo = consumo;
            }

            public void setPeso(double peso) {
                this.peso = peso;
            }

            public String getMarca() {
                return marca;
            }

            public String getModelo() {
                return modelo;
            }

            public double getPrecioUnit() {
                return precioUnit;
            }

            public String getColor() {
                return color;
            }

            public char getConsumo() {
                return consumo;
            }

            public double getPeso() {
                return peso;
            }
	    //mediante un un void hare  la comprobacion de la marca mediante un listado que defino aqui
	    public void comprobarMarca(String marca) { 
	        if  (  marca == "Apple"   || marca == "Asus"
	            || marca == "Sony"    || marca == "HP"
	            || marca == "Huawei"  || marca == "Epson"
	            || marca == "Balay"   || marca == "Bosch"
	            || marca == "LG"      || marca == "Sharp"
	            || marca == "Jata"    || marca == "Romba"
	            || marca == "Irobot"  || marca == "Solac"
	            || marca == "Philips" || marca == "Rowenta"
	            || marca == "Siemens" || marca == "Daewo"
	            || marca == "Toshiva" || marca == "Canon"
	            || marca == "JVC"     || marca == "Fagor"
	            || marca == "Teka"    || marca == "Lynx"
	            || marca == "Nodor"   || marca == "Panasonic"
	            || marca == "Braun"   ||  marca == "Krups") {
	            this.marca = marca;
	        } else {
	            this.marca = "";
	        }       
	    }
	    //Con un condicional calculo el precio
	    private double calcularPrecio() {
	        double pesoPorPrecio = 0;
	    
	        this.comprobarConsumoEnergetico(this.consumo);
	            
	        if(this.peso >= 0 && this.peso <= 19) {
	            pesoPorPrecio = 19;
	        } else if(this.peso >= 20 && this.peso <= 49) {
	            pesoPorPrecio = 50;
	        } else if(this.peso >= 50 && this.peso <= 79) {
	            pesoPorPrecio = 80;
	        }   else {
	            pesoPorPrecio = 100;
	        }
	        
	        
	        this.precioUnit+= pesoPorPrecio;
	        
	        return this.precioUnit;
	    }   
	    
	    
	    Electrodomestico() {
	        this.color = "Blanco";
	        this.consumo = 'F';
	        this.peso = 5;
	        this.precioUnit = 100.00;
	    }
	    
	    Electrodomestico(double precio, double peso) {
	        this.color = "Blanco";
	        this.consumo = 'F';
	        this.peso = peso;
	        this.precioUnit = precioUnit;   
	    }
	    
	    Electrodomestico(double precio, double peso, String color, char consumo) {
	        this.precioUnit= precio;
	        this.peso = peso;
	        
	        this.comprobarColor(this.color);
	        
	        this.consumo = consumo;
	    }
	    
	    public void comprobarConsumoEnergetico(char letra) {
	        boolean exist = false;
	        //compruebo el consumo energetico  y las pongo con letras
	        switch(letra) {
	            case 'A':
	                exist = true;
	                this.precioUnit = 100.00;
	            break;
	            case 'B':
	                exist = true;
	                this.precioUnit = 80.00;
	            break;
	            case 'C':
	                exist = true;
	                this.precioUnit = 60.00;
	            break;
	            case 'D':
	                exist= true;
	                this.precioUnit = 50.00;
	            break;
	            case 'E':
	                exist = true;
	                this.precioUnit = 30.00;
	            break;
	            case 'F':
	                exist = true;
	                this.precioUnit = 10.00;
	            break;
	        }
	        
	        if(exist) {
	            this.consumo = letra;
	        }
	    }
	    
	    public void comprobarColor(String color) {
	        if(color == "Negro" || color == "Azul"
	            || color == "Gris" || color == "Rojo") {
	            this.color = color;
	        } else {
	            this.color = "Blanco";
	        }       
	    }
	    
	    public double precioFinal() {
	        return calcularPrecio();
	       }
	    }  
        
    