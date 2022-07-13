
package ENTIDADES;

import java.util.Date;


public class vendedor {
    private String nombre ;
    
    private Integer dni;
    
    private Double sueldoBasico;
    
    private Double comisiones;
    
    private Double sueldoMensual;
    
    private Date fechaInicio;

    //constructor vacio
    public vendedor() {
    }
    //constructor con parametros
    //este constructor nos permite que cuando nosotros invoquemos a vendedor y pasemos por parametros
    //cada 1 de los atributos,estos se guardan en los atributos arriba definidos previamente
    public vendedor(String nombre, Integer dni, Double sueldoBasico, Double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    
    //getter and setter
    //aqui podemos ver,por ej en el metodo get del atributo nombre es una funcion que retorna un dato del tipo string
    //lo vamos a invocar con el getnombre,no necesita de ningun parametro para funcionar y lo que retorna es el atributo de este objeto
    //(o sea nombre)
    

    public String getNombre() {
        return nombre;
    }
    // en cambio,para el setter lo que tenemos es un metodo void donde no va a retornar nada,yo le tengo que pasar
    // un parametro y lo que va  hacer es alojarlo en el atributo que este requiriendo,en este caso en nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    
    // el  metodo toString sirve para retornar una impresion del objeto con todos sus atributos detallados.
    @Override
    public String toString() {
        return "vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
    //una vez finalizado esto,vamos a crear el paquete servicio para operar con todos estos datos
    //una vez que tengamos el paquete servicio,vamos a crear la clase con el mismo nombre que el objeto,es decir
    //en este caso es vendedor el objeto,asi que le ponemos vendedorServicio
}  
