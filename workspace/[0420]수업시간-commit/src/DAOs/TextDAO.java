package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

public class TextDAO implements IDAO {
	
	private Scanner scanner;

	@Override
	public void connect(String name) throws FileNotFoundException {
		// TODO Auto-generated method stub
		this.scanner = new Scanner(new File(name));
	}
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		this.scanner.close();
	}
	@Override
	public CEntity read(CEntity entity, String ID) {
		while(scanner.hasNext()){
			entity.read(scanner);
			if(entity.getId().equals(ID)){
				return entity;
			}
		}
		return null;						//끝까지 가면 못찾은것
	}	
	@Override
	public void write(CEntity entity) {
		entity.write(scanner);
	}

	public boolean hasNext(){
		return this.scanner.hasNext();
	}
	

}
