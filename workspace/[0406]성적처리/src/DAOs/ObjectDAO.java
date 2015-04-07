package DAOs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.CEntity;

public class ObjectDAO implements IDAO { 
	public CEntity read(CEntity entity, String fileName) {
		try {
			ObjectInputStream in;
			in = new ObjectInputStream(new FileInputStream(fileName));
			entity = (CEntity)in.readObject();
			in.close();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return entity;
	}
	public void write(CEntity entity, String fileName) {
		// serialize
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(entity);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); 
		}

	}

}
