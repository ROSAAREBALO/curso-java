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
public class Teacher extends Person{
    private String profession;

    public Teacher( String name, String lastname, String dateOfBirthday, String dni,String profession) {
        //super se usa para heredar de la clase padre sus constructor
        super(name, lastname, dateOfBirthday, dni);
        this.profession = profession;
    }
    
    @Override
    public String gretting(){
      return " soy un teacher"+this.profession;
    }
    

    
    
}
