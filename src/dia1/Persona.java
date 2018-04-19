/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AREBALO
 */
public class Persona {
    //attributos
    //modificadores de acceso->que informacion es visible o restringitr informacion
    //son public ,private, protected
   private String nombre;
    private String apellido;
    
    //contructor por defecto java
    public Persona(){
    this.nombre="default nombre";
    this.apellido="default apellido";
    }
    
    public Persona(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    
    }
    
    //modificador ,tipo de retorno,nombre del metodo,parametros de entrada
    public String getNombreCompleto(){
     return this.nombre+" "+this.apellido;
    }
    
    //metodos get ,set son publicos
    //get para pedir
    //set pa cambiar modificar
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public void setApellido(String apellido){
      this.apellido=apellido;
    }
    
    //sobre escribir el metodo y mostra la informaciond e un obj en cadena
    @Override
    public String toString(){
      return "Nombre:" +this.nombre+ ",apellido:"+this.apellido;
    }
    
    
//    @Override
//    public String toString(){
//      return "Persona{"
//    }
}
