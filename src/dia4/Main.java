/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

/**
 *
 * @author AREBALO
 */
import dia2.Teacher;
import dia2.Student;
public class Main {
   public static void main (String args[]){
   
       University university;
       university=new University("umss");
       
       Teacher teacher1=new Teacher("alex","mamani","jan 15,1991","5425666","system ingenier");
       Student student1=new Student("juan","peres","may 15,1970","45453","2014525444");
       
       university.addPerson(teacher1);
       university.addPerson(student1);
       
       university.showListPerson();
   } 
}
