/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexcercises;

/**
 *
 * @author Eduardo
 */
public class Employee { //Atributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    //Constructor
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    
    }
    //Getters and Setters
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName (){
        return this.firstName+" "+this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){ //Multiply salary for number of months
        return this.salary*12;
    }
    public int raiseSalary(int percentage){ //increase the salary  according to a percentage
        this.salary+=this.salary*percentage/100;
        return this.salary;
    }
    @Override
    public String toString(){
        return "Employee[id= "+this.id+",name= "+this.getName()
                +" ,salary= "+this.salary+"]";
    }
    
}
