package DAOs;

import java.io.FileNotFoundException;

import entity.CEntity;


public interface IDAO {
	public void connect(String name) throws FileNotFoundException;
	public CEntity read(CEntity entity, String ID);
	public void write(CEntity entity);
	public void disconnect();
	
}
