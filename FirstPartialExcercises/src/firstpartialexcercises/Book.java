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
public class Book { //Atributes
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    
    //Constructors
    public Book(String name, Author[] authors, double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=0;
    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    //Getters and Setters
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    @Override
    public String toString(){
        return "Book[name: "+this.name+", authors= "+this.getAuthorNames(authors)+", price: "+
                this.price+", quantity: "+this.qty;
    }
    public String getAuthorNames(Author[] authors){ //method for the usage of an array
        String names="";                    //saving the author objects
        for (int i=0;i<authors.length;i++){
            names+=authors[i].toString()+",";
        }
        return names;
    }

}
