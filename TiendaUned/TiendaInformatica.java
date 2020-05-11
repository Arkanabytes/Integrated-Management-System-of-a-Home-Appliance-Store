import java.io.Serializable;
import java.util.Scanner;
import java.io.InputStreamReader;
//Clase necesaria para poder realizar la lectura de lineas desde teclado.
import java.io.BufferedReader;
//Clase necesaria para gestionar las excepciones posibles producidas en la entrada/salida de datos.
import java.io.IOException;
//Clase necesaria para poder trabajar con listas ArrayList.
import java.util.ArrayList;
//Clases necesarias para las formas en las que trabajaremos con las fechas,
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//Clase necesaria para generar numeros aleatorios.
import java.util.Random;
//Clase necesaria para obtener la salida de una fecha con un determinado formato.
import java.text.SimpleDateFormat;
/**
 * Write a description of class Tienda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TiendaInformatica extends Tienda{

    //Creamos un nuevo objeto para guardar en el las listas de clientes, compras, reparaciones, devoluciones cambios
    private Tienda tienda = new Tienda();


  
 
  public static void main(String[] args) {
    System.out.println("Bienvenido a nuestra tienda UNEDEVELOPER"+
                       "El programa simula una tienda que vende electrodomesticos\n"+
                       "Los artículos sólo se pueden vender si están disponibles en la tienda\n"+
                       "El usuario puede:\n"+
                       "Es cliente socio\n"+
                       "\t Comprar productos de los existentes.\n"+
                       "\t Añadir nuevos productos a la cesta.\n"+
                       "\t Consultar el importe de la cuenta.");
    
       boolean continuar = true;
       int lecturaProducto;
       int lecturaCantidad; //Variables para seleccionar el producto y la cantidad que se quiere comprar
       boolean socio= true;
 
        //Se crea el array "catálogo" para contener los productos. Su dimensión viene del número de veces que se
    //instancia el contructor de Producto
    Producto seccion[] = new Producto[Producto.dimesionArray];
    //Se crea el objeto gestion para trabajar (mostrar y vender productos, y mostrar caja)
    Cajero = new cajero();
 
    //Se rellena el array categorias
      Sonido[0] ={Auriculares,Altavoces,HomeCinema,Reproductor};
      Informatica[1] = {Portatil,Otorre,Tablet};
      Hogar[2] =Lavadora,Cocina;
      Imagen[3]=SmartTV,Proyector;
      Telefonia[4] =Fijo,Smartphone;
    
    do {
      System.out.println("\n\nIntroduzca la opción que desea realizar:\n"
                +"1. Mostrar productos\n"
                +"2. Tiene ficha cliente de socio ?"
                +"2. Vender productos\n"
                +"3. Mostrar caja\n"
                +"SALIR --> Pulse cualquier otro número\n"
                );
      switch (Leer.datoInt()) {
        case 1:
          gestion.mostrarProductos(Sonido,Informatica,Hogar,Telefonica,Imagen);
          break;
          
        case 2:
          System.out.println("¿Tiene identificacion de socio?");{
            if (GestionUsuario);
            }
           //falta el continuar
        
          case 2:
          System.out.println("¿Que producto desea comprar?");
          gestion.mostrarNombreProductos(seccion);
          lecturaProducto=Leer.datoInt();
          System.out.println("¿Cuánta cantidad desea comprar?");
          lecturaCantidad=Leer.datoInt();
          //Se carga el producto y la cantidad solicitada por el usuario
          gestion.comprarProducto(seccion, lecturaProducto, lecturaCantidad);
          break;
        case 3:
          System.out.println(gestion.mostrarCaja() +" €");
          break;
        default:
          //Se sale del programa
          continuar=false;
      }
      
    } while(continuar);
    
    System.out.println("**** Gracias por utilizar la aplicación. ****");
 
  }
 
}