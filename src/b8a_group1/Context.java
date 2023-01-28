/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8a_group1;

/**
 *
 * @author maryam
 */
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy){ 
		this.strategy = strategy; 
	} 

	public Book executeStrategy(String bookTitle, String bookAuthor, int bookYear, double bookPrice){ 
             return strategy.doOperation(bookTitle, bookAuthor, bookYear, bookPrice); 
	} 

}
