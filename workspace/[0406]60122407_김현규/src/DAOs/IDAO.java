package DAOs;

import entity.CEntity;


public interface IDAO {
	public CEntity read(CEntity entity, String fileName);
	// Object�� �ѱ�� � Attribute�� �ִ��� ���� ������ �߻�!
	public void write(CEntity entity, String fileName);

}
