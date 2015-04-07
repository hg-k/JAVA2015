package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

public class TextDAO implements IDAO {

	@Override
	public CEntity read(CEntity entity, String fileName) {
		try {
			Scanner scanner = new Scanner(new File(fileName));
			entity.read(scanner);
			return entity;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void write(CEntity entity, String fileName) {

	}

}
