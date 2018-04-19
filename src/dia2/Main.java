/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2;

/**
 *
 * @author AREBALO
 */
public class Main {
    public static void main (String arg[]){
        /*
    Person person1=new Person("juan","perez","may 26,1991","6758493");
    System.out.println(person1.toString());
*/
     //herencia
    Teacher teacher1=new Teacher("jose","salvatierra","jan 21,1981","148215","Sistem ingenier");
    System.out.println(teacher1.getName());
    
    Student student1=new Student("julio","loza","feb 28,1785","145125","2014589");
   System.out.println(student1.getName());
   
   //interfaces  
   //una clase abstracta no se puede instanciar
   //teacher1 es una instancia de la clase Teacher

   //un Objeto vive solo en memoria ->solo mientras se ejecuta el objeto vive
      //una clase abstracta tien metodos sin definir
      //las clases que extiendan d euna class abstracta tienen k implemetar los metodos abstractos de la class abstracta
      
//    //  System.out.println(teacher1.gretting());
      
      //una clase abstracta declara la existencia de metodos pero no la implementacion
      //Interfaces
      //Arraylist
      //Lambdas
      //class genericas
    System.out.println(teacher1.gretting());
    System.out.println(student1.gretting());
   
  }
}
