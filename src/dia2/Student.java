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
public class Student extends Person{
    private String codSis;

    public Student( String name, String lastname, String dateOfBirthday, String dni,String codSis) {
        super(name, lastname, dateOfBirthday, dni);
        this.codSis = codSis;
    }
    
    @Override
    public String gretting(){
      return "soy estudent"+this.name; 
    }
    
}
