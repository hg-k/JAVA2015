package entity;

import java.io.Serializable;
import java.util.Scanner;

public abstract class CEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	public abstract void read(Scanner scanner);
	public abstract void write();
}
