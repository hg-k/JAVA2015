package DAOs;

import java.io.FileNotFoundException;

import entity.CEntity;


public interface IDAO {
	public void connect(String name) throws FileNotFoundException;
	public CEntity read();
	// Object로 넘기면 어떤 Attribute가 있는지 몰라서 문제가 발생!
	public void write(CEntity entity);
	public void disconnect();
}
