package entity;

import java.io.Serializable;
import java.util.Scanner;

public class CGwamok extends CEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attribute
	private int ID;
	private String name;
	private int hakjeom;
	// Setters & Getters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHakjeom() {return hakjeom;}
	public void setHakjeom(int hakjeom) {this.hakjeom = hakjeom;}
	@Override
	public void read(Scanner scanner) {
		
	}
	@Override
	public void write(Scanner scanner) {
		
	}
}
