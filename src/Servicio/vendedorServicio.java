
package Servicio;

import ENTIDADES.vendedor;
import java.util.Date;
import java.util.Scanner;


public class vendedorServicio {
    //para empezar vamos a crear un metodo que retorne un objeto del tipo vendedor que se llame altaVendedor
    // no voy a necesitar utilizar ningun parametro pero ya le estoy avisando que este metodo  va a retornar
    //un objeto,para ello voy a tener que importar la entidad vendedor para avisarle que lo que esta definido aca va a ser
    //utilizado en la pestaña de servicios
      Scanner leer= new Scanner(System.in);
     
public vendedor altaVendedor() {
    // primero vamos a instanciar un objeto del tipo vendedor..algo interesante es que cuando instanciamos un objeto lo que podemos notar
    //es que el constructor utilizado para la instanciacion del objeto es el constructor vacio o por defecto que utilizamos en la entidad
    //en el caso de que yo este usando un constructor por parametros,tendria el mismo formato pero respetaria el constructor con parametros
    // es decir que dentro del parentesis yo lo que haria ademas seria pasar por parametros todos los atributos dentro de la variable
    // para que se guarden dentro de los atributos
     
     
    vendedor v1= new vendedor();
    //este objeto llamado v1 contiene todos los atributos que definimos en la entidad,pero estan vacios,tenemos que guardar informacion en estos atributos
    //para eso usamos el scanner para ir llenando los atributos
    
   
    
    System.out.println("ingrese el nombre del vendedor");
    
    v1.setNombre(leer.next());
    
     System.out.println("ingrese el dni del vendedor");
     
     v1.setDni(leer.nextInt());
    
      System.out.println("ingrese el sueldo basico del vendedor");
      
      v1.setSueldoBasico(leer.nextDouble());
      
      //no vamos a setear los valores de las comisiones ni del sueldo mensual ya que le vamos a pedir
      // al usuario  cual es la cantidad de ventas del vendedor
       System.out.println("ingrese el dia que comenzo a trabajar");
       
       int dia = leer.nextInt() ;
       
       System.out.println("ingrese el mes en el que comenzo a trabajar");
       
       int mes = leer.nextInt();
       
        System.out.println("ingrese el año en el que comenzo a trabajar");
        
        int anio = leer.nextInt();
        
        Date fecha =  new Date (anio-1900,mes-1,dia);
        
        v1.setFechaInicio(fecha);
        
        return v1;
}

     //ahora vamos a crear un metodo en donde podamos calcular cuales son las comisiones que le corresponden
    // en el mes y cual es el sueldo total que le corresponde en el mes que genero esas comisiones
    // vamos a crear un metodo del tipo void por que no necesitemos que retorne nada,pero si le vamos a pasar por parametros
    // un objeto del tipo vendedor donde yo quiero que se realizen estos calculos,para eso le vamos a pedir al usuario que ingrese
    // cuales fueron las ventas totales del vendedor
      public void  sueldoMensual (vendedor v1){
          
          
          System.out.println("ingrese cuales fueron las ventas totales del vendedor");
          
          Double ventas = leer.nextDouble ();
          
         v1.setComisiones(ventas*0.15);
         
         v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
         
          System.out.println("El sueldo mensual del vendedor:" + v1.getNombre()+ " es de $ " + v1.getSueldoMensual());
          
          
         
      }
      // ahora vamos a calcular cual es la antiguedad del vendedor para ver cuantos dias de vacas le corresponden
      // igual que el ej anterior necesitamos pasarle por parametro un objeto del tipo vendedor para poder realizar estos calculos
      // con los datos que provengan de ese objeto
       public void vacaciones (vendedor v1){
           Date hoy = new Date();
           int antiguedad = hoy.getYear()- v1.getFechaInicio().getYear() ;
           if (antiguedad<5){
               System.out.println("le corresponden 14 dias de vacaciones");
               
           }else if (antiguedad <10){
               System.out.println(" le corresponden 21 dias de vacaciones");
               
           }else if (antiguedad <20){
                System.out.println(" le corresponden 28 dias de vacaciones");
                
           }else if (antiguedad >20){
                System.out.println(" le corresponden 35 dias de vacaciones");
                
           }else {
                System.out.println(" le corresponden  vacaciones proporcionales");
           }
       }
       
       


}