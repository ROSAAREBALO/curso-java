
import static java.time.Clock.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AREBALO
 */
public class Main {

    public static void main(String arg[]) {
        //declaracion d eun objeto
        Persona personajuan;
        //instaciacion de un objeto

        //personajuan=new Persona();
        personajuan = new Persona("juan", "peres");

        //accediendo a los atributos publico
        //esto nose debe hacer
//     personajuan.nombre="Juan";
//     personajuan.apellido="Peres";
//     System.out.println("Mostrando el nombre");
//     System.out.println(personajuan.apellido);
//metodo dinamico
        System.out.println("nombre completo");
        System.out.println(personajuan.getNombreCompleto());
        System.out.println("accediendo al nombre get");
        System.out.println(personajuan.getNombre());
//probando el metodo set
        personajuan.setNombre("pedro");
        System.out.println(personajuan.getNombre());

//probando el metodo set
//personajuan.setApellido("rojas");
//System.out.println(personajuan.getApellido());
//metodo toString
        System.out.println("probando el metodo toString");
        System.out.println(personajuan.toString());

        /*
*tipos d edatos (int , Integer)[double,Double][char,Character] que diferencias ay 
*[String,que es?] [boolean,Boolean]
*hacer ejemplos de metodos con distintod tipos de retorno
*hacer ejemplos de metodos con distidntos tipos de parametros de entrada
*arreglos estaticos (k son ) ejjemplos
*como recorrer arreglos estaticos usando for
*como hacer un get y un set para un valor boolean
*dentro del curso llava poner get ignore
         */
        
       //arreglos estaticos
        int [] edad;
       edad=new int [4];
       edad[0]=1;
       edad[1]=2;
       edad[2]=3;
       edad[3]=4;
        for(int a=0;a<=edad.length;a++){
            System.out.println("arreglo estatico:"+edad[a]);
        }
        
    }
}
