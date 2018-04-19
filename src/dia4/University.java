/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;
import dia2.Person;
/**
 *
 * @author AREBALO
 */
public class University {
  private String name;
  private Person[] persons;
  private static int limit=5;
  private int count=0;
  
  public University(String name){
      this.name=name;
      this.count=0;
      this.persons=new Person[limit];
  
  }
  public void addPerson(Person newPerson){
     if(count<persons.length){
         persons[count]=newPerson;
         count=count+1;
     
     }
   
  }
  public void showListPerson(){
      
      for(int i=0;i<persons.length;i++){
          System.out.println(persons[i]);
      }
   
  }
  
}
