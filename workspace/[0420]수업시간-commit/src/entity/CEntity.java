package entity;

import java.io.Serializable;
import java.util.Scanner;

public abstract class CEntity implements Serializable {
	
	protected String ID;
	private static final long serialVersionUID = 1L;
	
	public String getId() {
		return ID;
	}
	public void setId(String ID) {
		this.ID = ID;
	};
	
	abstract public void read(Scanner scanner);
	abstract public void write(Scanner scanner);
	
}
