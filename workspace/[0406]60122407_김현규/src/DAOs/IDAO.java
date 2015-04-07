package DAOs;

import entity.CEntity;


public interface IDAO {
	public CEntity read(CEntity entity, String fileName);
	// Object로 넘기면 어떤 Attribute가 있는지 몰라서 문제가 발생!
	public void write(CEntity entity, String fileName);

}
